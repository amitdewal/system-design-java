/**
 * 
 */
package com.system.ad.solid.lsp.solution;

/*
 * LSP Correct Design Example
 *
 * Liskov Substitution Principle (LSP):
 * Subclasses must be substitutable for their base class
 * without altering the correctness of the program.
 *
 * Instead of forcing all birds to "fly",
 * we define a general behavior: "move".
 * Every bird can move, but in different ways.
 */
public abstract class Bird {
	
	/*
	 * We define a generic contract: move().
	 *
	 * The base class does not assume HOW a bird moves. It only guarantees that
	 * every bird can move.
	 *
	 * This prevents subclasses from breaking behavior.
	 */
	public abstract void move();

}
