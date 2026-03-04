/**
 * 
 */
package com.system.ad.system.design.parkinglot.fare;

import java.math.BigDecimal;
import java.util.List;

//import java.awt.List;

/**
 * 
 */
public class FareCalculator {

	private List<FareStrategy> fareStrategies;

	/**
	 * @param fareStrategy
	 */
	public FareCalculator(List<FareStrategy> fareStrategies) {

		this.fareStrategies = fareStrategies;
	}

	public BigDecimal calculateFare(Ticket ticket) {
		BigDecimal fare = BigDecimal.ZERO;
		for (FareStrategy fareStrategy : fareStrategies) {
			fare = fareStrategy.calculateFare(ticket, fare);
		}
		return fare;

	}
}
