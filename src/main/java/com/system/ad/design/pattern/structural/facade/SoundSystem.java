/**
 * 
 */
package com.system.ad.design.pattern.structural.facade;

/**
 * 
 */
public class SoundSystem {

	public void turnOn() {
		System.out.println("Sound System:: Turned On...");
	}

	public void setVolume(int level) {

		System.out.println("Sound System:: Volume set to " + level);
	}
}
