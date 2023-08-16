package org.javaCore.polymorphism.domain;

public class Tomato extends Product {
    public static final double TAX = 0.06;
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando o imposto do tomate: ");
        return this.value * TAX;
    }
}
