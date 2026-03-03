/**
 * 
 */
package com.system.ad.system.design.parkinglot.spot;

import com.system.ad.system.design.parkinglot.vehicle.Vehicle;
import com.system.ad.system.design.parkinglot.vehicle.VehicleSize;

/**
 * 
 */
public interface ParkingSpot {
	boolean isAvailable();

	void occupy(Vehicle vehicle);

	void vacate();

	int getSpotNumber();

	VehicleSize getSize();

}
