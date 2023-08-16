package org.javaCore.inheritance.domain;

import org.javaCore.inheritance.enums.CarColor;

public abstract class Car {
    protected String model;
    protected static final double SPEED_LIMIT = 250;
    protected CarColor carColor;

    public Car(String model, CarColor carColor) {
        this.model = model;
        this.carColor = carColor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public CarColor getCarColor() {
        return carColor;
    }
}
