/**
 * 
 */
package com.system.ad.locking.pessimistic;

/**
 * Pessimistic Locking → Assume conflict will happen, so lock the resource.
 * Locks the resource before update to prevent concurrent modification.
 * 
 * Thread A ---- LOCK ----> Update ---- Unlock
 * Thread B ---- WAIT ----> Update
 * 
 */
public class PessimisticLockingDemo {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();

		Runnable task = () -> {
			bankAccount.withdraw(700);
		};

		Thread t1 = new Thread(task, "User-1");
		Thread t2 = new Thread(task, "User-2");

		t1.start();
		t2.start();
	}

}

class BankAccount {

	private int balance = 1000;

	public synchronized void withdraw(int ammount) {

		if (balance >= ammount) {

			System.out.println(Thread.currentThread().getName() + " withdrawing " + ammount);
			balance -= ammount;
			System.out.println("Remaining balance: " + balance);
		} else {
			System.out.println("Insufficient balance");

		}
	}

}