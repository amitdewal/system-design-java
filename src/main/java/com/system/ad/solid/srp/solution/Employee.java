/**
 * 
 */
package com.system.ad.solid.srp.solution;

/**
 * 
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

	/*
	 * SRP Reminder: 
	 * 
	 * This method is responsible ONLY for salary calculation logic.
	 * It does not handle reporting, printing, or persistence. If salary rules
	 * change, only this class should change. This ensures the class has a single
	 * reason to change.
	 */
	public double calculateSalary() {
		return salary * 12;// yearly salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

//	public void setSalary(double salary) {
//		this.salary = salary;
//	}



}
