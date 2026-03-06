/**
 * 
 */
package com.system.ad.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

import com.system.ad.design.pattern.structural.composite.component.Employee;

/**
 * Manager → group of employees
 */
public class Manager implements Employee {

	private String name;

	private List<Employee> employees;

	/**
	 * @param name
	 * @param employees
	 */
	public Manager(String name) {
		super();
		this.name = name;
		this.employees = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void showDetails() {
		System.out.println("Manager: " + this.name);

		for (Employee employee : employees) {
			employee.showDetails();

		}
	}

}
