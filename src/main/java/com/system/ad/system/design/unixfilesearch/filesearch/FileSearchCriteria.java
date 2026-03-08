/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch;

import com.system.ad.system.design.unixfilesearch.filesearch.clause.Predicate;
import com.system.ad.system.design.unixfilesearch.filesearch.filesystem.File;

/**
 * 
 */
public class FileSearchCriteria {

	private Predicate predicate;

	/**
	 * @param predicate
	 */
	public FileSearchCriteria(Predicate predicate) {
		super();
		this.predicate = predicate;
	}

	  // Checks if the given file matches the search criteria
    public boolean isMatch(final File inputFile) {
        return predicate.isMatch(inputFile);
    }

}
