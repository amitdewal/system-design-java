/**
 * 
 */
package com.system.ad.design.pattern.behavioral.strategy.second.exmaple.strategy.impl;

import java.math.BigDecimal;

import com.system.ad.design.pattern.behavioral.strategy.second.exmaple.context.PaymentContext;
import com.system.ad.design.pattern.behavioral.strategy.second.exmaple.strategy.PaymentStrategy;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {

		PaymentContext context = new PaymentContext();

//		PaymentStrategy payment = new CreditCardPayment("ABC-1234-XYZ");

		PaymentStrategy payment = new PaypalPayment("amit@hotmail.com");
		context.setPaymentStrategy(payment);
		payment.pay(BigDecimal.valueOf(5000.60));

	}

}
