/**
 * 
 */
package com.system.ad.design.pattern.behavioral.strategy.impl;

import com.system.ad.design.pattern.behavioral.strategy.PaymentStrategy;

/**
 * 
 */
public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("paid " + amount + " using credit card");
	}

}
