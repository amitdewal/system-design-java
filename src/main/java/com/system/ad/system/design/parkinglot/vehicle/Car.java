/**
 * 
 */
package com.system.ad.system.design.parkinglot.vehicle;

/**
 * 
 */
public class Car implements Vehicle {
	private String licensePlate;
	
	

	/**
	 * @param licensePlate
	 */
	public Car(String licensePlate) {
		super();
		this.licensePlate = licensePlate;
	}

	@Override
	public String getLicensePlate() {

		return this.licensePlate;
	}

	@Override
	public VehicleSize getSize() {

		return VehicleSize.MEDIUM;
	}

}
