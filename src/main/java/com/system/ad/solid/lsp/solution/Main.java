/**
 * 
 */
package com.system.ad.solid.lsp.solution;

/*
 * Runtime polymorphism:
 * Parent reference holds child objects.
 *
 * Both Sparrow and Ostrich can safely replace Bird.
 * No unexpected behavior or runtime errors occur.
 *
 * This confirms LSP compliance.
 */
public class Main {
	public static void main(String[] args) {

		Bird sparrow = new Sparrow();
		Bird ostrich = new Ostrich();

		sparrow.move();// Calls Sparrow implementation

		ostrich.move(); // Calls Ostrich implementation
	}
}
