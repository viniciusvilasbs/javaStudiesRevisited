package org.javaCore.collections.test;

import org.javaCore.collections.domain.Smartphone;
import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone smartphone01 = new Smartphone("123456", "Xiaomi");
        Smartphone smartphone02 = new Smartphone("987654", "iPhone");
        Smartphone smartphone03 = new Smartphone("456123", "Samsung");
        List<Smartphone> smartphoneList = new ArrayList<>();
        smartphoneList.add(smartphone01);
        smartphoneList.add(smartphone02);
        smartphoneList.add(0, smartphone03); //é possível escolher o index do objeto dentro da lista, basta colocar o número antes

//        smartphoneList.remove(smartphone01);

        for (Smartphone smartphone : smartphoneList) {
            System.out.println(smartphone);
        }

        Smartphone smartphone04 = new Smartphone("258963", "Motorola");
        System.out.println("Existe na lista? " + smartphone04.getBrand() + ": " + smartphoneList.contains(smartphone04));
        smartphoneList.add(smartphone04);
        System.out.println("Existe na lista? " + smartphone04.getBrand() + ": " + smartphoneList.contains(smartphone04));

        if (smartphoneList.contains(smartphone04)) {
            System.out.println("Index do smartphone " + smartphone04.getBrand() + ": " + smartphoneList.indexOf(smartphone04));
        } else {
            System.out.println("Smartphone não consta na lista!");
        }
    }
}
