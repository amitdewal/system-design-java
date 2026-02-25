/**
 * 
 */
package com.system.ad.solid.dip.problem;

/**
 * 
 */
public class Switch {

	/**
	 * 
	 */
	public Switch() {
		// TODO Auto-generated constructor stub
	}

	private LightBulb lightBulb;

	/**
	 * @param lightBulb
	 */
	public Switch(LightBulb lightBulb) {
		this.lightBulb = lightBulb;
	}

	public void operate() {
		lightBulb.turnOn();
	}

}
