/**
 * 
 */
package com.system.ad.solid.isp.solution;

/**
 * 
 */
public class HumanWorker implements Workable, Eatable, Sleepable {

	/**
	 * 
	 */
	public HumanWorker() {
	}

	@Override
	public void sleep() {
		System.out.println("Human sleeping...");

	}

	@Override
	public void eat() {
		System.out.println("Human eating...");

	}

	@Override
	public void work() {
		System.out.println("Human working...");

	}

}
