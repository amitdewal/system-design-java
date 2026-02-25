/**
 * 
 */
package com.system.ad.solid.dip.solution;

/**
 * 
 */
public class LightBulb implements Switchable{

	/**
	 * 
	 */
	public LightBulb() {
		
	}

	@Override
	public void turnOn() {
		System.out.println("bulb is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("bulb is off");
	}

}
