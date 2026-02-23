package com.system.ad.oops.encapsulation;

/**
 * Person class demonstrates the concept of Encapsulation.
 *
 * Encapsulation means: - Hiding internal data (variables) - Allowing controlled
 * access through public methods (getters/setters)
 */
public class Person {

	// Private data members (attributes)
	// These variables cannot be accessed directly from outside the class.
	// This ensures data hiding.
	private String name;
	private int age;

	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * 
	 */
	public Person() {
		super();
	}

	/**
	 * Getter method for name.
	 *
	 * @return name of the person
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name.
	 *
	 * Allows controlled modification of the name field.
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for age.
	 *
	 * @return age of the person
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Setter method for age.
	 *
	 * Demonstrates validation logic before assigning value.
	 *
	 * @param age the age to set
	 */
	public void setAge(int age) {

		// Validation: age should not be negative
		if (age >= 0) {
			this.age = age;
		}
	}
}