package org.javaCore.collections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> comics = new ArrayList<>();
        comics.add("Spiderman");
        comics.add("Hulk");
        comics.add("Superman");
        comics.add("Batman");
        comics.add("WonderWoman");
        comics.add("Flash");
        comics.add("Avengers");

        Collections.sort(comics);

        for (String comic : comics) {
            System.out.println("Comics: " + comic);
        }


    }
}
