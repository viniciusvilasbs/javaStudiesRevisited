package org.javaCore.designPatterns.test;

import org.javaCore.designPatterns.domain.singleton.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        AircraftSingletonEagerTest01.bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraftSingletonEager);
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
