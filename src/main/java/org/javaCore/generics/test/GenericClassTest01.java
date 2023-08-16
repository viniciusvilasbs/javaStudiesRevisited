package org.javaCore.generics.test;

import org.javaCore.generics.domain.SuperBoat;
import org.javaCore.generics.domain.SuperCar;
import org.javaCore.generics.service.RentalServiceGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest01 {
    public static void main(String[] args) {
        List<SuperCar> superCars = new ArrayList<>(List.of(new SuperCar("Ferrari"), new SuperCar("Lamborghini"), new SuperCar("BMW")));
        List<SuperBoat> superBoats = new ArrayList<>(List.of(new SuperBoat("Lancha"), new SuperBoat("Iate"), new SuperBoat("Speed Boat")));

        RentalServiceGenerics<SuperCar> rentalServiceGenericsCar = new RentalServiceGenerics<>(superCars);
        SuperCar superCarFerrari = rentalServiceGenericsCar.searchingAvailableVehicles();
        System.out.println("---Depois de usar o carro por um mês...");
        rentalServiceGenericsCar.returnRentedVehicle(superCarFerrari);

        System.out.println("--------------------------------------");

        RentalServiceGenerics<SuperBoat> rentalServiceGenericsBoat = new RentalServiceGenerics<>(superBoats);
        SuperBoat superBoatLancha = rentalServiceGenericsBoat.searchingAvailableVehicles();
        System.out.println("---Depois de usar o barco por um mês...");
        rentalServiceGenericsBoat.returnRentedVehicle(superBoatLancha);

    }
}
