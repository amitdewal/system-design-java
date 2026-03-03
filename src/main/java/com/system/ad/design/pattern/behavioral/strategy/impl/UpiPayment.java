/**
 * 
 */
package com.system.ad.design.pattern.behavioral.strategy.impl;

import com.system.ad.design.pattern.behavioral.strategy.PaymentStrategy;

/**
 * 
 */
public class UpiPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("paid " + amount + " using UPI");
		
	}

}
