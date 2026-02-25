/**
 * 
 */
package com.system.ad.solid.lsp.solution;

/**
 * 
 */
public class Sparrow extends Bird {

	/*
	 * Sparrow moves by flying.
	 *
	 * It fulfills the same contract (move), but with different internal behavior.
	 *
	 * This is valid polymorphism.
	 */

	@Override
	public void move() {
		System.out.println("Sparrow flies in the sky.");

	}

}
