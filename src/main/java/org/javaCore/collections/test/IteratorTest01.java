package org.javaCore.collections.test;

import org.javaCore.collections.domain.Comics;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Comics> comics = new ArrayList<>();
        comics.add(new Comics(5L,"Spiderman", 19.9, 5));
        comics.add(new Comics(7L,"Hulk", 15.9, 0));
        comics.add(new Comics(1L, "Superman", 20.00, 2));
        comics.add(new Comics(6L, "Batman", 18.90, 3));
        comics.add(new Comics(4L,"WonderWoman", 17.90, 0));
        comics.add(new Comics(2L, "Flash", 21.85, 1));
        comics.add(new Comics(3L, "Avengers", 22.50, 0));

        /*
        Iterator<Comics> comicsIterator = comics.iterator();

        while (comicsIterator.hasNext()) {
            if (comicsIterator.next().getQuantity() == 0) {
                comicsIterator.remove();
            }
        }
        */

        comics.removeIf(comic -> comic.getQuantity() == 0); // programação funcional: esse removeif faz o mesmo do metodo comicsIterator

        System.out.println("Lista de comics com quantidade positiva: " + comics);
    }
}
