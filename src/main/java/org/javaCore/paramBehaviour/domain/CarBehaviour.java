package org.javaCore.paramBehaviour.domain;

public class CarBehaviour {
    private String model = "Audi";
    private String color;
    private int year;

    public CarBehaviour(String color, int year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarBehaviour{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
