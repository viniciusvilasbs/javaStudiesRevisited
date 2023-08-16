package org.javaCore.generics.test;

import org.javaCore.generics.domain.SuperBoat;

import java.util.List;

public class GenericMethodsTest01 {
    public static void main(String[] args) {
        List<SuperBoat> boatList = createArrayWithObject(new SuperBoat("Canoa"));
        System.out.println(boatList);
    }

//    o <T> indicando que o método é genérico deve vir depois do static e antes do TIPO
    private static <T> List<T> createArrayWithObject(T t) {
        return List.of(t);
    }

//    o método a seguir exige que a classe do objeto extenda comparable
//    private static <T extends Comparable> List<T> createArrayWithObject(T t) {
//        return List.of(t);
//    }
}
