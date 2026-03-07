/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.location;

import com.system.ad.system.design.movieticketbooking.rate.PricingStrategy;

/**
 * 
 */
public class Seat {

	private String seatNumber;
	private PricingStrategy pricingStrategy;

	/**
	 * @param seatNumber
	 * @param pricingStrategy
	 */
	public Seat(String seatNumber, PricingStrategy pricingStrategy) {
		super();
		this.seatNumber = seatNumber;
		this.pricingStrategy = pricingStrategy;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public PricingStrategy getPricingStrategy() {
		return pricingStrategy;
	}

	public void setPricingStrategy(PricingStrategy pricingStrategy) {
		this.pricingStrategy = pricingStrategy;
	}

}
