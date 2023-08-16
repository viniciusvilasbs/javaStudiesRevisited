package org.javaCore.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {

        List<String> names = List.of("Vinicius", "Camila", "Raul", "Francine");
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        forEach(names, name -> System.out.println(name));
        forEach(numbers, number -> System.out.println(number));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T element : list) {
            consumer.accept(element);
        }
    }
}
