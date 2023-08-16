package org.javaCore.designPatterns.test;

import org.javaCore.designPatterns.domain.singleton.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraftSingletonLazy);
        System.out.println(aircraftSingletonLazy.bookSeat(seat));
    }
}
