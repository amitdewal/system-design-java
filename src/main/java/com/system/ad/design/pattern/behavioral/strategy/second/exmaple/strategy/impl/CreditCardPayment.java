/**
 * 
 */
package com.system.ad.design.pattern.behavioral.strategy.second.exmaple.strategy.impl;

import java.math.BigDecimal;

import com.system.ad.design.pattern.behavioral.strategy.second.exmaple.strategy.PaymentStrategy;

/**
 * 
 */
public class CreditCardPayment implements PaymentStrategy {

	private String cardNumber;
	
	

	/**
	 * @param cardNumber
	 */
	public CreditCardPayment(String cardNumber) {
		super();
		this.cardNumber = cardNumber;
	}



	@Override
	public void pay(BigDecimal amount) {
		System.out.println("paid using card:: " + cardNumber);

	}

}
