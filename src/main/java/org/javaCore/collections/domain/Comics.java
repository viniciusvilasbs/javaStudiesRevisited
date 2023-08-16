package org.javaCore.collections.domain;

import java.util.Objects;

public class Comics implements Comparable<Comics>{
    private Long id;
    private String comicsName;
    private double price;
    private  int quantity;

    public Comics(Long id, String comicsName, double price) {
        Objects.requireNonNull(id, "Id não pode ser nulo!");
        Objects.requireNonNull(comicsName, "Nome não pode ser nulo!");
        this.id = id;
        this.comicsName = comicsName;
        this.price = price;
    }

    public Comics(Long id, String comicsName, double price, int quantity) {
        this(id, comicsName, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "id=" + id +
                ", comicsName='" + comicsName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comics comics = (Comics) o;
        return Objects.equals(id, comics.id) && Objects.equals(comicsName, comics.comicsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, comicsName);
    }

    @Override
    public int compareTo(Comics otherComics) {
        // negativo se o this < otherComics
        // se this == otherComics, return 0
        // positivo se o this > otherComics
        /* if (this.id< otherComics.getId()) {
            return -1;
        } else if (this.id.equals(otherComics.getId())) {
            return 0;
        } else {
            return 1;
        } */
        return this.comicsName.compareTo(otherComics.getComicsName()); //desse modo não pode ser utilizado com tipos primitivos
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComicsName() {
        return comicsName;
    }

    public void setComicsName(String comicsName) {
        this.comicsName = comicsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
