package org.javaCore.designPatterns.test;

import org.javaCore.designPatterns.domain.singleton.AircraftSingle;

public class AircraftSingletonTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        AircraftSingle aircraftSingle = new AircraftSingle("787-900");
        System.out.println(aircraftSingle.bookSeat(seat));
    }
}
