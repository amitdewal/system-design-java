/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch.clause;

import com.system.ad.system.design.unixfilesearch.filesearch.filesystem.File;
import com.system.ad.system.design.unixfilesearch.filesearch.filesystem.FileAttribute;
import com.system.ad.system.design.unixfilesearch.filesearch.operator.ComparisonOperator;

//import java.nio.file.attribute.FileAttribute;

/**
 * a basic predicate that compares a file attribute with an expected value
 * 
 */
public class SimplePredicate<T> implements Predicate {

//	 the name of the file attribute to check
	private final FileAttribute fileAttribute;

//     The operator to use for comparison (equals, contains, greater than, etc.)
	private final ComparisonOperator<T> operator;

//	 The expected value to compare against
	T expectedValue;

	/**
	 * @param fileAttribute
	 * @param operator
	 * @param expectedValue
	 */
	public SimplePredicate(final FileAttribute fileAttribute, final ComparisonOperator<T> operator,
			final T expectedValue) {
		super();
		this.fileAttribute = fileAttribute;
		this.operator = operator;
		this.expectedValue = expectedValue;
	}

	@Override
	public boolean isMatch(final File inputFile) {
//		 extract the actual value of the attribute from the file
		Object actualValue = inputFile.extract(fileAttribute);

//		 check the actual value is of correct type

		if (expectedValue.getClass().isInstance(actualValue)) {
//			 perform the comparison using sp. operator
			return operator.isMatch((T) actualValue, expectedValue);

		} else {
			return false;
		}

	}

}
