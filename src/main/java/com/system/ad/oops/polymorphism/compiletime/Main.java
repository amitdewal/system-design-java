/**
 * 
 */
package com.system.ad.oops.polymorphism.compiletime;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {
		MathOperation math = new MathOperation();
		int sum1 = math.add(10, 30);
		double sum2 = math.add(5.0, 3.0);
		String result = math.add("Hello", "World");

		System.out.println("Sum of integers " + sum1);
		System.out.println("Sum of doubles " + sum2);
		System.out.println("Concatenated of strings " + sum1);

	}

}
