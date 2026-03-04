/**
 * 
 */
package com.system.ad.system.design.parkinglot.fare;

import java.math.BigDecimal;

/**
 * 
 */
public class BaseFareStrategy implements FareStrategy {
	private BigDecimal SMALL_VEHICLE_RATE = new BigDecimal("1.0");
	private BigDecimal MEDIUM_VEHICLE_RATE = new BigDecimal("2.0");
	private BigDecimal LARGE_VEHICLE_RATE = new BigDecimal("3.0");

	@Override
	public BigDecimal calculateFare(Ticket ticket, BigDecimal inputFare) {
		BigDecimal fare = inputFare;

		BigDecimal rate;
		switch (ticket.getVehicle().getSize()) {
		case MEDIUM:
			rate = MEDIUM_VEHICLE_RATE;
			break;
		case LARGE:
			rate = LARGE_VEHICLE_RATE;
			break;

		default:
			rate = SMALL_VEHICLE_RATE;
			break;
		}

		fare = fare.add(rate.multiply(ticket.calculateParkingDuration()));
		return fare;
	}

}
