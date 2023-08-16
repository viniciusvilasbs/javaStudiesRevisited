package org.javaCore.generics.domain;

public class SuperBoat {
    private String model;

    public SuperBoat(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "SuperBoats{" +
                "model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
