package org.javaCore.collections.test;

import java.util.Formattable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("C", "Letra C");
        navigableMap.put("D", "Letra D");
        navigableMap.put("A", "Letra A");
        navigableMap.put("B", "Letra B");

//        o NavigableMap organiza os itens automaticamente
        for (Map.Entry<String, String> entry : navigableMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("******************************");
        System.out.println("HeadMap: " + navigableMap.headMap("D", true)); // retorna os valores menores que o buscado, se colocar TRUE no inclusive retorna também o valor buscado
        System.out.println("LowerKey: " + navigableMap.lowerKey("C")); // imediatamente abaixo do valor buscado
        System.out.println("FloorKey: " + navigableMap.floorKey("C")); // igual minimo valor buscado
        System.out.println("HigherKey: " + navigableMap.higherKey("C")); // imediatamente acima do valor buscado
        System.out.println("CeilingKey: " + navigableMap.ceilingKey("B")); // igual maximo valor buscado
    }
}
