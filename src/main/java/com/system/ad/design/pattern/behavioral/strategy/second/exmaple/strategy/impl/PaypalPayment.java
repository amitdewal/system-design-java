/**
 * 
 */
package com.system.ad.design.pattern.behavioral.strategy.second.exmaple.strategy.impl;

import java.math.BigDecimal;

import com.system.ad.design.pattern.behavioral.strategy.second.exmaple.strategy.PaymentStrategy;

/**
 * 
 */
public class PaypalPayment implements PaymentStrategy {
	private String email;

	
	/**
	 * @param email
	 */
	public PaypalPayment(String email) {
		super();
		this.email = email;
	}


	@Override
	public void pay(BigDecimal amount) {
		System.out.println("pay via email: " + email);
	}

}
