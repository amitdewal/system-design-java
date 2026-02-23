/**
 * 
 */
package com.system.ad.solid.ocp.solution;

import java.util.List;

/**
 * 
 */
public class AreaCalculator {

	/**
	 * 
	 */
	public double doublecalculateTotalArea(List<Shape> shapes) {

		double total = 0;

		for (Shape shape : shapes) {
			total = total + shape.calculateArea();

		}
		return total;

	}

}
