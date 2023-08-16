package org.javaCore.enumTypes.enums;

import org.w3c.dom.ls.LSOutput;

public enum PaymentType {
    DEBITO {
        @Override
        public double calculateDiscount(double value) {
            System.out.println("Desconto no débito: ");
            return value * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calculateDiscount(double value) {
            System.out.println("Desconto no crédito: ");
            return value * 0.05;
        }
    };

    public abstract double calculateDiscount(double value);
}
