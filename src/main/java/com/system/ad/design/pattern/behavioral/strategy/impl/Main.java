/**
 * 
 */
package com.system.ad.design.pattern.behavioral.strategy.impl;

import com.system.ad.design.pattern.behavioral.strategy.PaymentStrategy;
import com.system.ad.design.pattern.behavioral.strategy.context.PaymentContext;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {

		PaymentStrategy creditCardPayment = new CreditCardPayment();
		PaymentStrategy upiPayment = new UpiPayment();
		PaymentStrategy payPalPayment = new PaypalPayment();

		PaymentContext context1 = new PaymentContext(creditCardPayment);
		context1.executePayment(500);

		PaymentContext context2 = new PaymentContext(upiPayment);
		context2.executePayment(100);
		PaymentContext context3 = new PaymentContext(payPalPayment);
		context3.executePayment(50);

	}
}
