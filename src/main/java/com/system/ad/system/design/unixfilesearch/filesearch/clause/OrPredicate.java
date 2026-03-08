/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch.clause;

import java.util.List;

import com.system.ad.system.design.unixfilesearch.filesearch.filesystem.File;

/**
 * 
 */
public class OrPredicate implements CompositePredicate {

	private final List<Predicate> operands;

	/**
	 * @param operands
	 */
	public OrPredicate(List<Predicate> operands) {
		super();
		this.operands = operands;
	}

	@Override
	public boolean isMatch(File inputFile) {
		return operands.stream().anyMatch(predicate -> predicate.isMatch(inputFile));
	}

}
