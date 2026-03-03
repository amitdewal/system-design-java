/**
 * 
 */
package com.system.ad.design.pattern.behavioral.strategy.second.exmaple.context;

import java.math.BigDecimal;

import com.system.ad.design.pattern.behavioral.strategy.second.exmaple.strategy.PaymentStrategy;

/**
 * 
 */
public class PaymentContext {

	private PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	void performPayment(BigDecimal amount) {
		paymentStrategy.pay(amount);

	}

}
