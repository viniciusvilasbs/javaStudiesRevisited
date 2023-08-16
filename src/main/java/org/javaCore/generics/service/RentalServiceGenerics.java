package org.javaCore.generics.service;

import java.util.List;

public class RentalServiceGenerics<T> {
    private List<T> availableVehicles;

    public RentalServiceGenerics(List<T> availableVehicles) {
        this.availableVehicles = availableVehicles;
    }

    public T searchingAvailableVehicles() {
        System.out.println("Buscando veículos disponíveis...");
        T t = availableVehicles.remove(0);
        System.out.println("Alugando veículo: " + t);
        System.out.println("Veículos disponíveis para alugar: ");
        System.out.println(availableVehicles);
        return t;
    }

    public void returnRentedVehicle(T t) {
        System.out.println("Devolvendo veículo: " + t);
        availableVehicles.add(t);
        System.out.println("Veículos disponíveis para alugar: ");
        System.out.println(availableVehicles);
    }
}
