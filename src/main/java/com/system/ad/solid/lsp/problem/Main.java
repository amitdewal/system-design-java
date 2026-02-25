/**
 * 
 */
package com.system.ad.solid.lsp.problem;

/*
 * Here we are using polymorphism.
 * We expect every Bird reference to behave correctly.
 */
public class Main {
	public static void main(String[] args) {
		Bird bird = new Bird();// Works fine
		bird.fly();

		Bird ostrich = new Ostrich(); // Substitution happens here
		ostrich.fly();// Runtime failure -> LSP violation
	}

}
