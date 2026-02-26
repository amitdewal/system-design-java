/**
 * 
 */
package com.system.ad.oops.polymorphism.runtime;

/**
 * Dog class extends Animal.
 *
 * Demonstrates method overriding.
 * The sound() method is overridden to provide
 * specific behavior for Dog.
 */
public class Dog extends Animal {

    /**
     * Overridden method.
     *
     * @Override ensures:
     * - Method signature matches parent
     * - Compile-time safety check
     *
     * This method will be called at runtime
     * when the object is of type Dog.
     */
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof!");
    }
}