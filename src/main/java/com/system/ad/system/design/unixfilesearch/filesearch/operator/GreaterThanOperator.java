/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch.operator;

/**
 * impls greater then comparison for numberic values
 */
public class GreaterThanOperator<T extends Number> implements ComparisonOperator<T> {

	@Override
	public boolean isMatch(final T attributeValue, final T expectedValue) {

		return Double.compare(attributeValue.doubleValue(), expectedValue.doubleValue()) > 0;
	}

}
