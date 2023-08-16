package org.javaCore.inheritance.test;

import org.javaCore.inheritance.enums.CarColor;
import org.javaCore.inheritance.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari("F250", CarColor.RED, 260);

        System.out.println(ferrari.toString());
        System.out.println(ferrari.getCarColor());
    }
}
