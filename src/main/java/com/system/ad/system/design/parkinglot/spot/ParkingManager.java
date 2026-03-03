/**
 * 
 */
package com.system.ad.system.design.parkinglot.spot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.system.ad.system.design.parkinglot.vehicle.Vehicle;
import com.system.ad.system.design.parkinglot.vehicle.VehicleSize;

/**
 * 
 */
public class ParkingManager {

	private Map<VehicleSize, List<ParkingSpot>> availableSpots;

	private Map<Vehicle, ParkingSpot> vehicleToSpotMap;

	/**
	 * @param availableSpots
	 * @param vehicleToSpotMap
	 * 
	 */
//	create parking manager based on a given map of available spots;
	public ParkingManager(Map<VehicleSize, List<ParkingSpot>> availableSpots,
			Map<Vehicle, ParkingSpot> vehicleToSpotMap) {
		super();
		this.availableSpots = availableSpots;
		this.vehicleToSpotMap = new HashMap<>();
	}

	public ParkingSpot findSpotForVehicle(Vehicle vehicle) {
		VehicleSize vehicleSize = vehicle.getSize();

		// start looking for thr smallest spot that can fit the vehicle
           
		for (VehicleSize size : VehicleSize.values()) {

			if (size.ordinal() >= vehicleSize.ordinal()) {
				List<ParkingSpot> spots = availableSpots.get(size);

				for (ParkingSpot spot : spots) {
					if (spot.isAvailable()) {
						return spot; // return the first available spot
					}
				}
			}

		}

		return null; // no suitable spot
	}

	public ParkingSpot parkVehicle(Vehicle vehicle) {

		ParkingSpot spot = findSpotForVehicle(vehicle);

		if (spot != null) {
			spot.occupy(vehicle);

			// record the parking spot for the vehicle;

			vehicleToSpotMap.put(vehicle, spot);

			// remove the spot from the avialble list;
			availableSpots.get(spot.getSize()).remove(spot);
			return spot; // parking successful
		}

		return null;// no spot found for this vehicle

	}

	void unparkVehicle(Vehicle vehicle) {

		ParkingSpot spot = vehicleToSpotMap.remove(vehicle);
		if (spot != null) {
			spot.vacate();
			availableSpots.get(spot.getSize()).add(spot);
		}

	}
}
