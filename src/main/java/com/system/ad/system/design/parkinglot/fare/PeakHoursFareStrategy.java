/**
 * 
 */
package com.system.ad.system.design.parkinglot.fare;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 
 */
public class PeakHoursFareStrategy implements FareStrategy {

	// 50% higher during peak hours
	private BigDecimal PEAK_HOURS_MULTIPLIER = new BigDecimal("1.5");

	/**
	 * 
	 */
	public PeakHoursFareStrategy() {
		super();

	}

	@Override
	public BigDecimal calculateFare(Ticket ticket, BigDecimal inputFare) {
		BigDecimal fare = inputFare;
		if (isPeakHours(ticket.getEntryTime())) {
			fare = fare.multiply(PEAK_HOURS_MULTIPLIER);
		}

		return fare;
	}

	/**
	 * @param entryTime
	 * @return
	 */
	private boolean isPeakHours(LocalDateTime time) {
		int hour = time.getHour();
		return (hour >= 7 && hour <= 10) || (hour >= 16 && hour <= 19);
	}

}
