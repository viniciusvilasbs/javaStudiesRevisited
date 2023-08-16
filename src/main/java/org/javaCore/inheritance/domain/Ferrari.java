package org.javaCore.inheritance.domain;

import org.javaCore.inheritance.enums.CarColor;

public class Ferrari extends Car {
    private double topSpeed;

    public Ferrari(String model, CarColor carColor, double topSpeed) {
        super(model, carColor);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "topSpeed=" + topSpeed +
                ", model='" + model + '\'' +
                ", carColor=" + carColor +
                '}';
    }

    public void setTopSpeed(double topSpeed) {
       this.topSpeed = topSpeed;
   }

   public double getTopSpeed() {
       return this.topSpeed;
   }
}
