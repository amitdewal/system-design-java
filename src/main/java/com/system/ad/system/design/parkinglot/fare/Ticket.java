/**
 * 
 */
package com.system.ad.system.design.parkinglot.fare;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

import com.system.ad.system.design.parkinglot.spot.ParkingSpot;
import com.system.ad.system.design.parkinglot.vehicle.Vehicle;

/**
 * 
 */
public class Ticket {

	private String ticketId; // unique ticket identifier
	private Vehicle vehicle; // the vehicle associated with the ticket
	private ParkingSpot parkingSpot; // the parking spot where vehicle is parked
	private LocalDateTime entryTime; // the time the vehicle enterred the parking lot
	private LocalDateTime exitTime; // the time the vehicle exited the parking lot

	/**
	 * @param ticketId
	 * @param vehicle
	 * @param parkingSpot
	 * @param entryTime
	 * @param exitTime
	 */
	public Ticket(String ticketId, Vehicle vehicle, ParkingSpot parkingSpot, LocalDateTime entryTime,
			LocalDateTime exitTime) {
		super();
		this.ticketId = ticketId;
		this.vehicle = vehicle;
		this.parkingSpot = parkingSpot;
		this.entryTime = entryTime;
		// initially exit time is null because the vehicle is still parked
		this.exitTime = null;
	}
	
	

	public String getTicketId() {
		return ticketId;
	}



	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}



	public Vehicle getVehicle() {
		return vehicle;
	}



	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}



	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}



	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}



	public LocalDateTime getEntryTime() {
		return entryTime;
	}



	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}



	public LocalDateTime getExitTime() {
		return exitTime;
	}



	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}


	/*
	 * entryTime → starting time 
	 * exitTime → if null, use current time 
	 * ↓ Calculate difference
	 * ↓ Convert to minutes 
	 * ↓ Convert to BigDecimal 
	 * ↓ Return
	 */
	public BigDecimal calculateParkingDuration() {
		return new BigDecimal(
				Duration.between(entryTime, Objects.requireNonNullElseGet(exitTime, LocalDateTime::now)).toMinutes());

	}
	

}
