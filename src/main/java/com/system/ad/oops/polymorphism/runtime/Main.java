/**
 * 
 */
package com.system.ad.oops.polymorphism.runtime;

/**
 * Main class to demonstrate Runtime Polymorphism.
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Parent reference holding child objects.
         *
         * This is the key concept of runtime polymorphism.
         *
         * Reference type: Animal
         * Object type: Dog and Cat
         */
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        /**
         * Method call is decided at runtime
         * based on the actual object (Dog or Cat),
         * not the reference type (Animal).
         *
         * This is called Dynamic Method Dispatch.
         */
        animal1.sound();  // Calls Dog's sound()
        animal2.sound();  // Calls Cat's sound()
    }
}