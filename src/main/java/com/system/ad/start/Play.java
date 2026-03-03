/**
 * 
 */
package com.system.ad.start;

/**
 * Because:
String
Integer
Both are equally specific (both are subclasses of Object).
Java gets confused.
 */
public class Play {


	public static void main(String[] args) {

		Play demo = new Play();
		demo.method(null);

	}

	public void method(String val) {
		System.out.println("string method called");
	}

	public void method(Integer val) {
		System.out.println("Integer method called");
	}


}
