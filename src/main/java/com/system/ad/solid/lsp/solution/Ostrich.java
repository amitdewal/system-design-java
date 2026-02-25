/**
 * 
 */
package com.system.ad.solid.lsp.solution;

/**
 * 
 */
public class Ostrich extends Bird {

	/*
	 * Ostrich cannot fly, but it can move by running.
	 *
	 * This implementation respects the parent contract. No exception is thrown.
	 * Behavior remains valid.
	 *
	 * Therefore, substitution is safe.
	 */
	@Override
	public void move() {
		System.out.println("Ostrich run on the ground...");

	}

}
