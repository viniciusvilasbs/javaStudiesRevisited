package org.javaCore.jdbcCrud.service;

import org.javaCore.jdbcCrud.domain.AnimeCrud;
import org.javaCore.jdbcCrud.domain.ProducerCrud;
import org.javaCore.jdbcCrud.repository.AnimeRepositoryCrud;

import java.util.Optional;
import java.util.Scanner;

public class AnimeServiceCrud {
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
        AnimeRepositoryCrud.findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s, %d, %s%n", p.getId(), p.getName(), p.getEpisodes(), p.getProducerCrud().getName()));
    }

    private static void delete() {
        System.out.println("Type the anime's ID you want to delete:");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y | N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            AnimeRepositoryCrud.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the anime's name:");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes:");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the ID of the Producer:");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        AnimeCrud anime = AnimeCrud.builder()
                .name(name)
                .episodes(episodes)
                .producerCrud(ProducerCrud.builder().id(producerId).build())
                .build();
        AnimeRepositoryCrud.save(anime);
    }

    public static void update() {
        System.out.println("Type the ID of the object you want to update");
        Optional<AnimeCrud> animeOptional = AnimeRepositoryCrud
                .findById(Integer.parseInt(SCANNER.nextLine()));

        if (animeOptional.isEmpty()) {
            System.out.println("anime not found!");
            return;
        }

        AnimeCrud animeFromDb = animeOptional.get();
        System.out.println("anime found: " + animeFromDb);

        System.out.println("Type the new name or ENTER to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the new number of episodes:");
        int episodes = Integer.parseInt(SCANNER.nextLine());


        AnimeCrud producerToUpdate = AnimeCrud.builder()
                .id(animeFromDb.getId())
                .episodes(episodes)
                .producerCrud(animeFromDb.getProducerCrud())
                .name(name)
                .build();

        AnimeRepositoryCrud.update(producerToUpdate);
    }
}
