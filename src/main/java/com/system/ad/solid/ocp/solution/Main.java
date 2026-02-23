/**
 * 
 */
package com.system.ad.solid.ocp.solution;

import java.util.Arrays;
import java.util.List;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 5);
//		Circle circle = new Circle(7);

		List<Shape> shapes = Arrays.asList(rectangle /*circle*/);

		AreaCalculator areaCalculator = new AreaCalculator();
		double totalArea = areaCalculator.doublecalculateTotalArea(shapes);

		System.out.println("total area: " + totalArea + " "+ shapes.getFirst().getClass().getSimpleName());
	}

}
