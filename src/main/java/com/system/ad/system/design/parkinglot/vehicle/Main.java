/**
 * 
 */
package com.system.ad.system.design.parkinglot.vehicle;

import java.math.BigDecimal;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {

		BigDecimal decimal = new BigDecimal(5.0);
		System.out.println(decimal);
		BigDecimal bigDecimal = decimal.add(new BigDecimal("2.0"));
		BigDecimal multiply = bigDecimal.multiply(new BigDecimal("20"));
		System.out.println(bigDecimal);
		System.out.println(multiply);
	
	}

}
