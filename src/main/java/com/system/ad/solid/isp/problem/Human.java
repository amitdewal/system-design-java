/**
 * 
 */
package com.system.ad.solid.isp.problem;

/**
 * 
 */
public class Human implements Worker {

	/**
	 * 
	 */
	public Human() {
	}

	@Override
	public void work() {
		System.out.println("performing task like coding.");

	}

	@Override
	public void eat() {
		System.out.println("Eating a meal.");

	}

	@Override
	public void sleep() {
		System.out.println("Sleeping for rest.");
	}

}
