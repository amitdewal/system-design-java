/**
 * 
 */
package com.system.ad.start;

/**
 * ⚠ Important Concept (For Interviews)

If finally contains a return statement:

It suppresses any previous return values.

It also suppresses exceptions.
 */
public class Main {

	public static void main(String[] args) {
		int result = method();
		System.out.println(result);

	}

	public static int method() {
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}
