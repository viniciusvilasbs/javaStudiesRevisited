package org.javaCore.polymorphism.service;

import org.javaCore.polymorphism.domain.Product;

public class TaxCalculator {
    private static double TAX;

    public static void calculateTax(Product product) {
        System.out.println("Relatótio de cálculo de imposto: ");
        TAX = product.calculateTax();
        System.out.println("Produto: " + product.getName());
        System.out.println("Valor: " + product.getValue());
        System.out.println("Valor do imposto a ser pago: " + TAX);
        System.out.println();
    }
}
