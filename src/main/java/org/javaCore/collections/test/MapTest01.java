package org.javaCore.collections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); //se quiser manter a ordem de inserção use o LINKEDHASHMAP<>()
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2");  // se adicionar novo objeto igual a um existente, ele subistiuirá o antigo
//                                            então, use o putIfAbsent para evitar substituições indesejadas.

        System.out.println(map);
        System.out.println("*********************");

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + " - Value: " + map.get(key));
        }

        System.out.println("*********************");

        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        System.out.println("*********************");
//        para acessar os 2 atributos (KEY e VALUE) ao mesmo tempo, em apenas um laço for, faça o seguinte:
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
    }
}
