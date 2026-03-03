/**
 * 
 */
package com.system.ad.start;

/**
 * When multiple overloaded methods match: Java picks the method with the
 * closest inheritance level String is closer than Object At compile time, Java
 * chooses the most specific method. String is a subclass of Object So String is
 * more specific than Object Since null can be assigned to any reference type,
 * Java selects the most specific applicable method.
 */
public class Demo {

	public static void main(String[] args) {

		Demo demo = new Demo();

		demo.method(null);

	}

	public void method(String val) {
		System.out.println("string method called");
	}

	public void method(Object val) {
		System.out.println("object method called");
	}
}
