/**
 * 
 */
package com.system.ad.locking.optimistic;

/**
 * Optimistic Locking → Assume conflict rarely happens, detect conflict later.
 * Allows concurrent access but detects conflicts using a version check during update.
 * 
 * Thread User-1 read version 1
 * Thread User-2 read version 1
 * Thread User-1 update -> version 2
 * Thread User-2 update -> version mismatch -> FAIL
 */
public class OptimisticLockDemo {
	public static void main(String[] args) {

		Product product = new Product(10);

		Runnable task = () -> {
			int currentQuantity = product.getQuantity();
			int currentversion = product.getVersion();

			System.out.println(Thread.currentThread().getName() + " read quantity: " + currentQuantity + " version: "
					+ currentversion);

			boolean success = product.updateQuantity(currentQuantity - 1, currentversion);
			if (!success) {
				System.out.println(Thread.currentThread().getName() + " failed due to version conflict");

			}
		};
		Thread t1 = new Thread(task, "User-1");
		Thread t2 = new Thread(task, "User-2");

		t1.start();
		t2.start();

	}

}

class Product {
	private int quantity;
	private int version;

	/**
	 * @param quantity
	 * @param version
	 */
	public Product(int quantity) {
		super();
		this.quantity = quantity;
		this.version = 1;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public synchronized boolean updateQuantity(int newQty, int expectedVersion) {

		// check version before updating
		if (this.version != expectedVersion) {
			System.out.println(Thread.currentThread().getName() + " -> conflict detected");
			return false;

		}
		System.out.println(Thread.currentThread().getName() + " -> updating quantity");
		this.quantity = newQty;
		this.version++;
		System.out.println("New quantity: " + quantity + " | version: " + version);
		return true;
	}
}
