/**
 * 
 */
package com.system.ad.oops.polymorphism.compiletime;

/**
 * 
 */
/**
 * MathOperation class demonstrates method overloading in Java.
 *
 * Method overloading means:
 * Same method name
 * Different parameter types or number of parameters
 *
 * This is an example of Compile-Time Polymorphism.
 */
public class MathOperation {

    /**
     * Adds two integer values.
     *
     * This method is selected when both arguments are of type int.
     * Example: add(10, 20)
     *
     * @param a first integer
     * @param b second integer
     * @return sum of two integers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds two double values.
     *
     * This method is selected when both arguments are of type double.
     * Example: add(5.5, 6.5)
     *
     * @param a first double
     * @param b second double
     * @return sum of two doubles
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Concatenates two String values.
     *
     * This method is selected when both arguments are Strings.
     * It does not perform arithmetic addition,
     * it joins the two strings together.
     *
     * Example: add("Hello ", "World")
     *
     * @param str1 first string
     * @param str2 second string
     * @return combined string
     */
    public String add(String str1, String str2) {
        return str1 + str2;
    }
}