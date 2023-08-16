package org.javaCore.collections.test;

import org.javaCore.collections.domain.Comics;
import org.javaCore.collections.domain.Smartphone;

import java.util.*;

class SmarthphoneBrandComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class ComicsPriceComparator implements Comparator<Comics> {
    @Override
    public int compare(Comics o1, Comics o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphonesNavig = new TreeSet<>(new SmarthphoneBrandComparator());
        Smartphone smartphone = new Smartphone("159260", "Nokia");
        smartphonesNavig.add(smartphone);
        System.out.println(smartphonesNavig);
        System.out.println("********************");

        NavigableSet<Comics> comicsNavig = new TreeSet<>(new ComicsPriceComparator());
        comicsNavig.add(new Comics(5L,"Spiderman", 19.9, 5));
        comicsNavig.add(new Comics(7L,"Hulk", 15.9, 0));
        comicsNavig.add(new Comics(1L, "Superman", 20.00, 2));
        comicsNavig.add(new Comics(6L, "Batman", 18.90, 3));
        comicsNavig.add(new Comics(4L,"WonderWoman", 17.90, 0));
        comicsNavig.add(new Comics(2L, "Flash", 21.85, 1));
        comicsNavig.add(new Comics(3L, "Avengers", 22.50, 0));
        comicsNavig.add(new Comics(3L, "Avengers", 22.50, 0));
        comicsNavig.add(new Comics(8L, "Aaragon", 12.50, 0));

        for (Comics comics : comicsNavig) {
            System.out.println(comics);
        }
        System.out.println("****************************");

//        métodos de comparação:
//        lower < compara valores menores e trás no return o valor menor imediato ao que foi buscado
//        floor <= compara valores iguais ou menores e trás no return o valor igual imediato ao que foi buscado
//        higher > compara valores maiores e trás no return o valor maior imediato ao que foi buscado
//        ceiling >= compara valores iguais ou maiores e trás no return o valor igual imediato ao que foi buscado
        Comics thor = new Comics(9L, "Thor", 17.9, 4);
        System.out.println("Lower < " + comicsNavig.lower(thor));
        System.out.println("Floor <= " + comicsNavig.floor(thor));
        System.out.println("Higher > " + comicsNavig.higher(thor));
        System.out.println("Ceiling >= " + comicsNavig.ceiling(thor));
        System.out.println("****************************");

//        busca e remove:
        System.out.println(comicsNavig.size());
        System.out.println("PollFirst busca o primeiro item da lista e o remove: " + comicsNavig.pollFirst());
        System.out.println(comicsNavig.size());
        System.out.println("****************************");
        System.out.println(comicsNavig.size());
        System.out.println("PollLast busca o último item da lista e o remove: " + comicsNavig.pollLast());
        System.out.println(comicsNavig.size());
    }
}
