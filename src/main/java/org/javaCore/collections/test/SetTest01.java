package org.javaCore.collections.test;

import org.javaCore.collections.domain.Comics;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Comics> comics = new HashSet<>(); // se quiser manter a ordem de inserção use o LINKEDHASHSET<>()
        comics.add(new Comics(5L,"Spiderman", 19.9, 5));
        comics.add(new Comics(7L,"Hulk", 15.9, 0));
        comics.add(new Comics(1L, "Superman", 20.00, 2));
        comics.add(new Comics(6L, "Batman", 18.90, 3));
        comics.add(new Comics(4L,"WonderWoman", 17.90, 0));
        comics.add(new Comics(2L, "Flash", 21.85, 1));
        comics.add(new Comics(3L, "Avengers", 22.50, 0));
        comics.add(new Comics(3L, "Avengers", 22.50, 0)); // set não aceita itens duplicados

        for (Comics comic : comics) {
            System.out.println(comic);
        }

    }
}
