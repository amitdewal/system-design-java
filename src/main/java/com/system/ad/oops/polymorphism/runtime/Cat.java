/**
 * 
 */
package com.system.ad.oops.polymorphism.runtime;

/**
 * Cat class extends Animal.
 *
 * Also overrides the sound() method.
 * Provides its own specific implementation.
 */
public class Cat extends Animal {

    /**
     * Overridden method for Cat.
     *
     * Runtime will decide this method
     * based on the actual object type.
     */
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow!");
    }
}
