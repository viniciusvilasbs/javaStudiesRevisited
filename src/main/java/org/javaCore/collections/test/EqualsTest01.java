package org.javaCore.collections.test;

import org.javaCore.collections.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone01 = new Smartphone("123456", "Xiaomi");
        Smartphone smartphone02 = new Smartphone("123456", "Xiaomi");

        System.out.println(smartphone01.equals(smartphone02));
    }
}
