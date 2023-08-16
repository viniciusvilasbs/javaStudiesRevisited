package org.javaCore.innerClasses.test;

import org.javaCore.generics.domain.SuperBoat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class BoatNameComparator implements Comparator<SuperBoat> {
//    @Override
//    public int compare(SuperBoat o1, SuperBoat o2) {
//        return o1.getModel().compareTo(o2.getModel());
//    }
//}
public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<SuperBoat> superBoats = new ArrayList<>(List.of((new SuperBoat("Lancha")), new SuperBoat("Canoa")));

//        superBoats.sort((o1, o2) -> o1.getModel().compareTo(o2.getModel())); // função lambda que faz o sort abaixo
        superBoats.sort(new Comparator<SuperBoat>() {
            @Override
            public int compare(SuperBoat o1, SuperBoat o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        });
        System.out.println(superBoats);
    }
}
