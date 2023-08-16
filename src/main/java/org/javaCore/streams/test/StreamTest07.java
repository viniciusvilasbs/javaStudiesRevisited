package org.javaCore.streams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        numbers.stream().reduce((x,y) -> x + y).ifPresent(System.out::println);
        System.out.println(numbers.stream().reduce(0, (x,y) -> x +y));
        System.out.println("******************");

//        maneira melhor e mais enxuta de fazer:
        numbers.stream().reduce(Integer::sum).ifPresent(System.out::println); // retorna um Optional
        System.out.println(numbers.stream().reduce(0, Integer::sum)); // aqui começa com zero, retorna um Integer, não um Optional

        System.out.println("******************");

        numbers.stream().reduce((x,y) -> x * y).ifPresent(System.out::println); // retorna um Optional
        System.out.println(numbers.stream().reduce(1, (x,y) -> x * y)); // retorna um Integer, não um Optional

        System.out.println("******************");

        numbers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println); // retorna um Optional
        System.out.println(numbers.stream().reduce(0,Integer::max)); // forma reduzida; retorna um Integer, não um Optional
    }
}
