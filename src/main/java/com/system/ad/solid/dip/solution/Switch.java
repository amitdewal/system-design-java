/**
 * 
 */
package com.system.ad.solid.dip.solution;

/**
 * 
 */
public class Switch {

	private Switchable device; // depends on abstraction

	/**
	 * 
	 */
	public Switch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param device
	 */
	public Switch(Switchable device) {

		this.device = device;
	}

	public void turnOff() {
		device.turnOff();
	}
	
	public void turnOn() {
		device.turnOn();
	}

}
