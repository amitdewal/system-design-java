/**
 * 
 */
package com.system.ad.design.pattern.structural.composite.leaf;

import com.system.ad.design.pattern.structural.composite.component.Employee;

/**
 * Developer → individual object
 */
public class Developer implements Employee {

	private String name;

	/**
	 * @param name
	 */
	public Developer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showDetails() {
		System.out.println("Developers: " + this.name);

	}

}
