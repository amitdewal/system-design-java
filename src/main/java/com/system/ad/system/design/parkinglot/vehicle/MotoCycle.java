/**
 * 
 */
package com.system.ad.system.design.parkinglot.vehicle;

/**
 * 
 */
public class MotoCycle implements Vehicle {
	private String licensePlate;
	

	/**
	 * @param licensePlate
	 */
	public MotoCycle(String licensePlate) {
		super();
		this.licensePlate = licensePlate;
	}

	@Override
	public String getLicensePlate() {
		return this.licensePlate;
	}

	@Override
	public VehicleSize getSize() {
		return VehicleSize.SMALL;
	}

}
