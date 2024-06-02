package org.example;

import org.example.code.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("3 - 2 = " + calculator.subtract(3, 2));
        System.out.println("2 * 3 = " + calculator.multiply(2, 3));
        System.out.println("4 / 2 = " + calculator.divide(4, 2));
    }
}