/**
 * 
 */
package com.system.ad.system.design.parkinglot.spot;

import com.system.ad.system.design.parkinglot.vehicle.Vehicle;
import com.system.ad.system.design.parkinglot.vehicle.VehicleSize;

/**
 * 
 */
public class HandicappedSpot implements ParkingSpot {

	private int spotNumber;
	private Vehicle vehicle; // the vehicle currently occupying this spot;

	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
		this.vehicle = null; // no vehicle occupying the initially
	}

	@Override
	public boolean isAvailable() {

		return vehicle == null;
	}

	@Override
	public void occupy(Vehicle vehicle) {
		if (isAvailable()) {
			this.vehicle = vehicle;

		} else {
			System.out.println("Spot is already occupied.");
		}
	}

	@Override
	public void vacate() {
		this.vehicle = null;
	}

	@Override
	public int getSpotNumber() {

		return spotNumber;
	}

	@Override
	public VehicleSize getSize() {

		return VehicleSize.MEDIUM;
	}

}
