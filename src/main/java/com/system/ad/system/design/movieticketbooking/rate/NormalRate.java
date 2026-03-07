/**
 * 
 */
package com.system.ad.system.design.movieticketbooking.rate;

import java.math.BigDecimal;

/**
 * 
 */
public class NormalRate implements PricingStrategy {

	private final BigDecimal price;

	/**
	 * @param price
	 */
	public NormalRate(BigDecimal price) {
		super();
		this.price = price;
	}

	@Override
	public BigDecimal getPrice() {
		return price;
	}

}
