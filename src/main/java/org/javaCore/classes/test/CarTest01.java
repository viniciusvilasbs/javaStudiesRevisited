package org.javaCore.classes.test;

import org.javaCore.classes.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car();

        car01.name = "Yellow Devil";
        car01.model = "Lamborghini";
        car01.year = 2023;

        car02.name = "Red Devil";
        car02.model = "Ferrari";
        car02.year = 2022;

        System.out.println("Carro: " + car01.name + ", modelo: " + car01.model + ", ano: " + car01.year);
        System.out.println("Carro: " + car02.name + ", modelo: " + car02.model + ", ano: " + car02.year);
    }
}
