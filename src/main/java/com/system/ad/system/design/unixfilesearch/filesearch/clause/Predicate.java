/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch.clause;

import com.system.ad.system.design.unixfilesearch.filesearch.filesystem.File;

/**
 * base interface for all file search predicates.
 */
public interface Predicate {
	// check if the given file match the search conditions.
	boolean isMatch(File inputFile);

}
