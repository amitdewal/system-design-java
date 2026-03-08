/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch.operator;

import java.util.Objects;

/**
 * impls exact equality comparison between values
 */
public class EqualsOperator<T> implements ComparisonOperator<T>{

	@Override
	public boolean isMatch(final T attributeValue,final T expectedValue) {

		return Objects.equals(expectedValue, attributeValue);
	}

}
