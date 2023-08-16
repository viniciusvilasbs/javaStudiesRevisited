package org.javaCore.designPatterns.domain.singleton;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingle {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public AircraftSingle(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public String getName() {
        return name;
    }
}
