package org.javaCore.paramBehaviour.test;

import org.javaCore.paramBehaviour.domain.CarBehaviour;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ParamBehaviourTest02 {
    private static List<CarBehaviour> carBehaviours = List.of(new CarBehaviour("green", 2016), new CarBehaviour("red", 2020), new CarBehaviour("blue", 2022));

    public static void main(String[] args) {

        /*
        List<CarBehaviour> greenCars = filter(carBehaviours, new CarPredicate() {
            @Override
            public boolean test(CarBehaviour carBehaviour) {
                return carBehaviour.getColor().equals("green");
            }
        });
        */

//        função lambda fazendo o mesmo do método greenCars na linha 15
        List<CarBehaviour> greenCars = filter(carBehaviours, carBehaviour -> carBehaviour.getColor().equals("green"));
        List<CarBehaviour> redCars = filter(carBehaviours, carBehaviour -> carBehaviour.getColor().equals("red"));
        List<CarBehaviour> yearBeforeCars = filter(carBehaviours, carBehaviour -> carBehaviour.getColor().equals("red"));
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);

        System.out.println("**************************");

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(numbers, number -> number % 2 == 0));
    }

//    método filter genérico, que aceita qualquer tipo de lista e de predicado, não apenas de carros, como antes
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}
