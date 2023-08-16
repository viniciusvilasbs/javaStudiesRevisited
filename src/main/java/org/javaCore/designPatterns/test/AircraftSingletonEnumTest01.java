package org.javaCore.designPatterns.test;

import org.javaCore.designPatterns.domain.singleton.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum aircraftSingletonEnum = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraftSingletonEnum.bookSeat(seat));
    }
}
