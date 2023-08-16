package org.javaCore.generics.test;

import org.javaCore.collections.domain.ConsumerCollections;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
//        type erasure
        List<String> list = new ArrayList<>();
        list.add("Vinicius");
        list.add("Camila");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("*****************");

        addGenericsTest(list, new ConsumerCollections("ViniciusTest"));
        for (Object o : list) {
            System.out.println(o);
        }
    }

    private static void addGenericsTest(List list, ConsumerCollections consumerCollections) {
        list.add(consumerCollections);
    }
}
