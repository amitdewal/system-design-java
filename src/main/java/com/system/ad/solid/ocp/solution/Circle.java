/**
 * 
 */
package com.system.ad.solid.ocp.solution;

/**
 * 
 */
public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * @param radius
	 */
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

}
