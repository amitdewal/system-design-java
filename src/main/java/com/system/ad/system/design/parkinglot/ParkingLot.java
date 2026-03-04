/**
 * 
 */
package com.system.ad.system.design.parkinglot;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.system.ad.system.design.parkinglot.fare.FareCalculator;
import com.system.ad.system.design.parkinglot.fare.Ticket;
import com.system.ad.system.design.parkinglot.spot.ParkingManager;
import com.system.ad.system.design.parkinglot.spot.ParkingSpot;
import com.system.ad.system.design.parkinglot.vehicle.Vehicle;

/**
 * 
 */
public class ParkingLot {

	private ParkingManager parkingManager;
	private FareCalculator fareCalculator;

	/**
	 * @param parkingManager
	 * @param fareCalculator
	 */
	public ParkingLot(ParkingManager parkingManager, FareCalculator fareCalculator) {
		super();
		this.parkingManager = parkingManager;
		this.fareCalculator = fareCalculator;
	}

	// method to handle vehicle entry into the parking lot
	public Ticket enterVehicle(Vehicle vehicle) {

		// delete gate parking logic to the parking manager
		ParkingSpot spot = parkingManager.parkVehicle(vehicle);

		if (spot != null) {
			// create ticket with entry time
			Ticket ticket = new Ticket(generateTicketId(), vehicle, spot, LocalDateTime.now());
			return ticket;
		} else {
			System.out.println("No available spots for vehicle: " + vehicle.getLicensePlate());
			return null; // no spot available
		}

	}

	// method to handle vehicle exit from the parking lot
	public void leaveVehicle(Ticket ticket) {
		// ensure vehicle is valid and vehicle has not already left
		if (ticket != null && ticket.getEntryTime() == null) {

			// set the exit time
			ticket.setExitTime(LocalDateTime.now());

			// delete gate unparking logic to parkingmanager
			parkingManager.unparkVehicle(ticket.getVehicle());

			// calculate fare
			BigDecimal fare = fareCalculator.calculateFare(ticket);
			System.out.println("vehilce total fare " + fare);
		} else {
			System.out.println("Invalid ticket or vehicle already exited");
		}

	}

	// Helper method to generate a unique ticket ID
	private String generateTicketId() {
		return "TICKET-" + System.currentTimeMillis();
	}

}
