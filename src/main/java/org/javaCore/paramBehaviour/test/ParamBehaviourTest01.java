package org.javaCore.paramBehaviour.test;

import org.javaCore.paramBehaviour.domain.CarBehaviour;
import org.javaCore.paramBehaviour.paramInterfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ParamBehaviourTest01 {
    private static List<CarBehaviour> carBehaviours = List.of(new CarBehaviour("green", 2016), new CarBehaviour("red", 2020), new CarBehaviour("blue", 2022));

    public static void main(String[] args) {

        /*
        List<CarBehaviour> greenCars = filterCar(carBehaviours, new CarPredicate() {
            @Override
            public boolean test(CarBehaviour carBehaviour) {
                return carBehaviour.getColor().equals("green");
            }
        });
        */

//        função lambda fazendo o mesmo do método greenCars na linha 15
        List<CarBehaviour> greenCars = filterCar(carBehaviours, carBehaviour -> carBehaviour.getColor().equals("green"));
        System.out.println(greenCars);
    }

    private static List<CarBehaviour> filterCar(List<CarBehaviour> carBehaviours, CarPredicate carPredicate) {
        List<CarBehaviour> filteredCar = new ArrayList<>();
        for (CarBehaviour carBehaviour : carBehaviours) {
            if (carPredicate.test(carBehaviour)) {
                filteredCar.add(carBehaviour);
            }
        }
        return filteredCar;
    }
}
