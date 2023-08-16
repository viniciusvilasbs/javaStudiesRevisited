package org.javaCore.collections.test;

import org.javaCore.collections.domain.Comics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        ComicsByIdComparator comicsByIdComparator = new ComicsByIdComparator();

        List<Comics> comics = new ArrayList<>();
        comics.add(new Comics(5L,"Spiderman", 19.9));
        comics.add(new Comics(7L,"Hulk", 15.9));
        comics.add(new Comics(1L, "Superman", 20.00));
        comics.add(new Comics(6L, "Batman", 18.90));
        comics.add(new Comics(4L,"WonderWoman", 17.90));
        comics.add(new Comics(2L, "Flash", 21.85));
        comics.add(new Comics(3L, "Avengers", 22.50));

        Comics comicsToSearch = new Comics(8L, "GreenLantern", 14.50);
        comics.add(comicsToSearch);

        comics.sort(comicsByIdComparator);

        for (Comics comic : comics) {
            System.out.println("Sorted by id: " + comic);
        }
        System.out.println("*****************************");

        System.out.println(Collections.binarySearch(comics, comicsToSearch, comicsByIdComparator)); // mostra a posição do comic green lantern
    }
}
