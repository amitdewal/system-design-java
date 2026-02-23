/**
 * 
 */
package com.system.ad.solid.ocp.solution;

/**
 * 
 */
public class Rectangle extends Shape {
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

	@Override
	public double calculateArea() {
		
		return width * height;
	}

}
