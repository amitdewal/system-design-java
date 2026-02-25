/**
 * 
 */
package com.system.ad.solid.isp.problem;

/**
 * 
 */
public class Robot implements Worker {

	/**
	 * 
	 */
	public Robot() {
	}

	@Override
	public void work() {
		System.out.println("Performing task like welding...");

	}

	@Override
	public void eat() {
		throw new UnsupportedOperationException("Robots dont eat");

	}

	@Override
	public void sleep() {
		throw new UnsupportedOperationException("Robots dont sleep");
	}

}
