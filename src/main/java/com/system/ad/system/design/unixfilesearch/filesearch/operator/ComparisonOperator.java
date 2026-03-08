/**
 * 
 */
package com.system.ad.system.design.unixfilesearch.filesearch.operator;

/**
 * base interfasce for all comparison operation in the file search system.
 */
public interface ComparisonOperator<T> {
	boolean isMatch(final T attributeValue , final T expectedValue);

}
