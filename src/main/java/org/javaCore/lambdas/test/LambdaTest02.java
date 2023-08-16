package org.javaCore.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {

        List<String> names = List.of("Vinicius", "Camila", "Raul", "Francine");
        List<Integer> numbers = returnR(names, namesNumber -> namesNumber.length());
        List<String> namesUpperCase = returnR(names, namesUp -> namesUp.toUpperCase());

        System.out.println(numbers);
        System.out.println(namesUpperCase);
    }

    private static <T, R> List<R> returnR(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T element : list) {
            R r = function.apply(element);
            result.add(r);
        }
        return result;
    }
}
