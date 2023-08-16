package org.javaCore.generics.domain;

public class SuperCar {
    private String model;

    public SuperCar(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
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
