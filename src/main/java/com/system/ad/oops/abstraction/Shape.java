/**
 * 
 */
package com.system.ad.oops.abstraction;

/**
 * 
 */
public abstract class Shape {

	public String color;

	/**
	 * @param color
	 */
	public Shape(String color) {
		this.color = color;
	}

	// abstract method
	public abstract double area();

	public void displayColor() {
		System.out.println("this shape is " + color + " .");
	}

}
