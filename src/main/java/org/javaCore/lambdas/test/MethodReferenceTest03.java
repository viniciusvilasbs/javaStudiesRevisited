package org.javaCore.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(List.of("Vinícius", "Camila", "Francine", "Raul", "Tania", "Chiquinho"));

//        Reference to an INSTANCE METHOD OF AN ARBITRARY OBJECT OF A PARCITULAR TYPE
        namesList.sort(String::compareTo);
        System.out.println("Organizando a lista por nome: " + namesList);
        System.out.println("*******************\n");

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println("Transformando string em integer: " + num);
        System.out.println("*******************\n");

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println("Checando se o nome existe na lista: " + checkName.test(namesList,"Vinícius"));
    }
}
