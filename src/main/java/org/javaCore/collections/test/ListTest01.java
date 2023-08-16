package org.javaCore.collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names01 = new ArrayList<>();
        List<String> names02 = new ArrayList<>();
        names01.add("Vinicius");
        names01.add("Camila");
        names02.add("Francine");
        names02.add("Raul");
        names02.add("Tania");
        names02.add("Francisco");

        for (String name : names01) {
            System.out.println("Nome: " + name);
        }

        System.out.println("***************************");

        names01.remove("Vinicius");

        names01.addAll(names02);

        for (int i = 0; i < names01.size() ; i++) {
            System.out.println("Nome " + i + ": " + names01.get(i));
        }
    }
}
