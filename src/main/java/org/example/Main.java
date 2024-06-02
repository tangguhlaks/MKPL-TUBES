package org.example;

import org.example.code.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double a = 10.0;
        double b = 5.0;

        double result;

        // Memanggil method add
        result = calculator.add(a, b);
        System.out.println("Hasil penjumlahan " + a + " + " + b + " = " + result);

        // Memanggil method subtract
        result = calculator.subtract(a, b);
        System.out.println("Hasil pengurangan " + a + " - " + b + " = " + result);

        // Memanggil method multiply
        result = calculator.multiply(a, b);
        System.out.println("Hasil perkalian " + a + " * " + b + " = " + result);

        // Memanggil method divide
        result = calculator.divide(a, b);
        System.out.println("Hasil pembagian " + a + " / " + b + " = " + result);
    }
}