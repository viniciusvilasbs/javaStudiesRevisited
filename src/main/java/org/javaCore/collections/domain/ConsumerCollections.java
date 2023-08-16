package org.javaCore.collections.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class ConsumerCollections {
    private Long id;
    private String name;

    public ConsumerCollections(String name) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100_000);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsumerCollections consumerCollections = (ConsumerCollections) o;
        return Objects.equals(id, consumerCollections.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
