/**
 * 
 */
package com.system.ad.solid.srp.problem;

/*
 * SRP Violation Example
 *
 * This Employee class has TWO responsibilities:
 *
 * 1. Salary calculation (business logic)
 * 2. Payroll report generation (reporting / formatting logic)
 *
 * Because it handles two different concerns, it has TWO reasons to change:
 *
 * - If salary calculation rules change (e.g., tax rate, bonus, allowances),
 *   this class must be modified.
 *
 * - If payroll report format changes (e.g., PDF, CSV, database, email format),
 *   this class must also be modified.
 *
 * This violates the Single Responsibility Principle (SRP),
 * which states that a class should have only ONE reason to change.
 */
public class Employee {
	private String name;
	private double salary;

	/**
	 * @param name
	 * @param salary
	 */
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	// Responsibility 1: Business logic
	public double calculateSalary() {
		return salary * 12;// yearly salary;

	}

	// Responsibility 2: Reporting logic
	public void generatePayrollReport() {
		System.out.println("payroll report for " + name + "$ " + salary);
	}

}
