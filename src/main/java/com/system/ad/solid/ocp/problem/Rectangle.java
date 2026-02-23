/**
 * 
 */
package com.system.ad.solid.ocp.problem;

/**
 * 
 */
public class Rectangle {
	private double width;
	private double height;

	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	/**
	 * 
	 */
	public double calculateArea() {
		return width * height;

	}

}
