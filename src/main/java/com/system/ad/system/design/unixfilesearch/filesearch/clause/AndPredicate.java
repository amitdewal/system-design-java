/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch.clause;

import java.util.List;

import com.system.ad.system.design.unixfilesearch.filesearch.filesystem.File;

/**
 * 
 */
public class AndPredicate implements CompositePredicate {

//	list of predicates that must all match combine multiple other predicated to match 
	private final List<Predicate> operands;

	/**
	 * @param operands
	 */
	public AndPredicate(List<Predicate> operands) {
		super();
		this.operands = operands;
	}

//	check if the given file matches all predicates
	@Override
	public boolean isMatch(File inputFile) {

		return operands.stream().allMatch(predicate -> predicate.isMatch(inputFile));
	}

}
