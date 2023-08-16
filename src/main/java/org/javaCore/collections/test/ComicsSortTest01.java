package org.javaCore.collections.test;

import org.javaCore.collections.domain.Comics;

import java.util.*;

class ComicsByIdComparator implements Comparator<Comics> {
    @Override
    public int compare(Comics comics1, Comics comics2) {
        return comics1.getId().compareTo(comics2.getId());
    }
}
public class ComicsSortTest01 {
    public static void main(String[] args) {
        List<Comics> comics = new ArrayList<>();
        comics.add(new Comics(5L,"Spiderman", 19.9));
        comics.add(new Comics(7L,"Hulk", 15.9));
        comics.add(new Comics(1L, "Superman", 20.00));
        comics.add(new Comics(6L, "Batman", 18.90));
        comics.add(new Comics(4L,"WonderWoman", 17.90));
        comics.add(new Comics(2L, "Flash", 21.85));
        comics.add(new Comics(3L, "Avengers", 22.50));

        for (Comics comic : comics) {
            System.out.println("Unsorted comics: " + comic);
        }
        System.out.println("***********************");

        Collections.sort(comics);

        for (Comics comic : comics) {
            System.out.println("Comics sorted by name: " + comic);
        }

        System.out.println("***********************");

//        Collections.sort(comics, new ComicsByIdComparator());
        comics.sort(new ComicsByIdComparator()); // igual a linha anterior, mas com menos argumentos
        for (Comics comic : comics) {
            System.out.println("Comics sorted by id: " + comic);
        }

    }
}
