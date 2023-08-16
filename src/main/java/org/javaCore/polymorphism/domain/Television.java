package org.javaCore.polymorphism.domain;

public class Television extends Product {
    public static final double TAX = 0.21;
    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando o imposto do computador: ");
        return this.value * TAX;
    }
}
