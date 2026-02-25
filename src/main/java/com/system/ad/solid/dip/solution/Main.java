/**
 * 
 */
package com.system.ad.solid.dip.solution;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Switchable bulb = new LightBulb();

		Switch lightSwitch = new Switch(bulb);
		lightSwitch.turnOff();

		
		Switchable fan = new Fan();
		Switch fanSwitch = new Switch(fan);
		fanSwitch.turnOn();
		
	}

}
