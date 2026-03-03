/**
 * 
 */
package com.system.ad.design.pattern.structural.facade;

/**
 * 
 */
public class Lights {
	public void dim(int level) {

		System.out.println("Ligths:: Dimmed to " + level + " %");
	}

	public void turnOn() {
		System.out.println("Ligths:: Turned On...");
	}

}
