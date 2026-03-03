/**
 * 
 */
package com.system.ad.design.pattern.behavioral.strategy.context;

import com.system.ad.design.pattern.behavioral.strategy.PaymentStrategy;

/**
 * 
 */
public class PaymentContext {
	
	private PaymentStrategy strategy;

	/**
	 * @param strategy
	 */
	public PaymentContext(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void executePayment(double amount) {
		strategy.pay(amount);
	}

}
