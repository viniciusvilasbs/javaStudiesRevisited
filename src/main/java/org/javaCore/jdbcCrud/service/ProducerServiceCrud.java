package org.javaCore.jdbcCrud.service;

import org.javaCore.jdbcCrud.domain.ProducerCrud;
import org.javaCore.jdbcCrud.repository.ProducerRepositoryCrud;

import java.util.Optional;
import java.util.Scanner;

public class ProducerServiceCrud {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
//            default -> throw new IllegalArgumentException("Not a valid option!");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        ProducerRepositoryCrud.findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type the producer's ID you want to delete:");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y | N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            ProducerRepositoryCrud.delete(id);
        }
    }

    private static void save() {

        System.out.println("Type the producer's name:");
        String name = SCANNER.nextLine();
        ProducerCrud producer = ProducerCrud.builder().name(name).build();
        ProducerRepositoryCrud.save(producer);
    }

    public static void update() {
        System.out.println("Type the ID of the object you want to update");
        Optional<ProducerCrud> producerOptional = ProducerRepositoryCrud
                .findById(Integer.parseInt(SCANNER.nextLine()));

        if (producerOptional.isEmpty()) {
            System.out.println("Producer not found!");
            return;
        }

        ProducerCrud producerFromDb = producerOptional.get();
        System.out.println("Producer found: " + producerFromDb);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDb.getName() : name;
        ProducerCrud producerToUpdate = ProducerCrud.builder()
                .id(producerFromDb.getId())
                .name(name)
                .build();

        ProducerRepositoryCrud.update(producerToUpdate);
    }
}
