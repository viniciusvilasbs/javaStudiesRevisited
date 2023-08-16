package org.javaCore.generics.test;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract void query();
}

class Dog extends Animal {
    @Override
    public void query() {
        System.out.println("Consultando cachorros.");
    }
}

class Cat extends Animal {
    @Override
    public void query() {
        System.out.println("Consultando gatos.");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        printQuery(dogs);
        printQuery(cats);

        System.out.println("***************************");

        List<Animal> animals = new ArrayList<>();
        printQueryAnimal(animals);
    }

    private static void printQuery(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.query();
        }
    }

    private static void printQueryAnimal(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
