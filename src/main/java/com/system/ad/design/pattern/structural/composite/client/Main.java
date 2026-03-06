/**
 * 
 */
package com.system.ad.design.pattern.structural.composite.client;

import com.system.ad.design.pattern.structural.composite.Manager;
import com.system.ad.design.pattern.structural.composite.leaf.Developer;
import com.system.ad.design.pattern.structural.composite.component.Employee;

/**
 * 
 */
public class Main {
	public static void main(String[] args) {

		Employee dev1 = new Developer("sachin");
		Employee dev2 = new Developer("rohit");

		Manager manager = new Manager("Sorav");

		manager.addEmployee(dev1);
		manager.addEmployee(dev2);

		manager.showDetails();
	}

}
