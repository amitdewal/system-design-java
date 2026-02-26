/**
 * 
 */
package com.system.ad.oops.polymorphism.runtime;

/**
 * Parent class Animal.
 *
 * This class defines a general behavior (sound) that
 * can be overridden by child classes.
 *
 * This is the base class in an inheritance hierarchy.
 */
public class Animal {

    /**
     * This method represents a generic animal sound.
     * It is meant to be overridden by subclasses.
     */
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}