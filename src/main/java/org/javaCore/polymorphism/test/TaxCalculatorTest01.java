package org.javaCore.polymorphism.test;

import org.javaCore.polymorphism.domain.Computer;
import org.javaCore.polymorphism.domain.Television;
import org.javaCore.polymorphism.domain.Tomato;
import org.javaCore.polymorphism.service.TaxCalculator;

public class TaxCalculatorTest01 {
    public static void main(String[] args) {
        Computer computer01 = new Computer("Rayzen5", 4500);
        Tomato tomato01 = new Tomato("Tomate Italiano", 4.9);
        Television tv01 = new Television("LG 55\" ", 7590);

        TaxCalculator.calculateTax(computer01);
        System.out.println("*********************************");
        TaxCalculator.calculateTax(tomato01);
        System.out.println("*********************************");
        TaxCalculator.calculateTax(tv01);
    }
}
