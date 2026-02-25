/**
 * 
 */
package com.system.ad.solid.lsp.problem;

/**
 * 
 */
public class Ostrich extends Bird {

	/*
	 * Problem: Ostrich is a Bird, but it cannot fly.
	 *
	 * This breaks the behavioral contract of Bird. Instead of performing the
	 * expected action, it throws an exception.
	 *
	 * Now Ostrich cannot safely replace Bird. This violates LSP.
	 */
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Ostrich can't fly");
	}

}
