/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch.clause;

import java.util.List;

import com.system.ad.system.design.unixfilesearch.filesearch.filesystem.File;

/**
 * 
 */
public class NotPredicate implements CompositePredicate {

	private final Predicate operand;

	/**
	 * @param operands
	 */
	public NotPredicate(Predicate operand) {
		super();
		this.operand = operand;
	}

	@Override
	public boolean isMatch(File inputFile) {
		return !operand.isMatch(inputFile);
	}

}
