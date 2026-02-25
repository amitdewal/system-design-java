/**
 * 
 */
package com.system.ad.solid.dip.solution;

/**
 * 
 */
public class Fan implements Switchable {

	@Override
	public void turnOn() {
		System.out.println("Fan is on.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Fan is off.");
		
	}

}
