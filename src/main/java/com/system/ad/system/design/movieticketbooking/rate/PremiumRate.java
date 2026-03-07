/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.rate;

import java.math.BigDecimal;

/**
 * 
 */
public class PremiumRate implements PricingStrategy {
	private final BigDecimal price;

	/**
	 * @param price
	 */
	public PremiumRate(BigDecimal price) {
		super();
		this.price = price;
	}

	@Override
	public BigDecimal getPrice() {
		return price;
	}

}
