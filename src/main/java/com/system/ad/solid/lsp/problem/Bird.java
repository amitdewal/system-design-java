/**
 * 
 */
package com.system.ad.solid.lsp.problem;

/*
 * LSP Violation Example
 *
 * Liskov Substitution Principle (LSP) states:
 * Subtypes must be substitutable for their base types
 * without breaking the expected behavior.
 */

public class Bird {
	
	/*
     * Assumption made by the base class:
     * All Birds can fly.
     * Clients using Bird expect fly() to work normally.
     */
	public void fly() {
		System.out.println("Flying in the sky...");
	}

}
