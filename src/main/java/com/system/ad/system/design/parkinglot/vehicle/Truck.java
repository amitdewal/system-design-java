/**
 * 
 */
package com.system.ad.system.design.parkinglot.vehicle;

/**
 * 
 */
public class Truck implements Vehicle {
	private String licensePlate;

	/**
	 * @param licensePlate
	 */
	public Truck(String licensePlate) {
		super();
		this.licensePlate = licensePlate;
	}

	@Override
	public String getLicensePlate() {
		return this.licensePlate;
	}

	@Override
	public VehicleSize getSize() {
		return VehicleSize.LARGE;
	}
}
