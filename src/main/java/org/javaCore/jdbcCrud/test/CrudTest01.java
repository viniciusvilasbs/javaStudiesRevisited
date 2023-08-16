package org.javaCore.jdbcCrud.test;

import org.javaCore.jdbcCrud.service.AnimeServiceCrud;
import org.javaCore.jdbcCrud.service.ProducerServiceCrud;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        int operation;

        while (true) {
            menu();
            operation = Integer.parseInt(SCANNER.nextLine());
            if (operation == 0) {
                break;
            }
            switch (operation) {
                case 1 -> {
                    producerMenu();
                    operation = Integer.parseInt(SCANNER.nextLine());
                    ProducerServiceCrud.menu(operation);
                }
                case 2 -> {
                    animeMenu();
                    operation = Integer.parseInt(SCANNER.nextLine());
                    AnimeServiceCrud.menu(operation);
                }
//                default -> throw new IllegalArgumentException("Invalid option!");
            }
        }

        SCANNER.close();
    }

    private static void menu(){
        System.out.println("Type the number of your operation:");
        System.out.println("0: Exit");
        System.out.println("1: Producer");
        System.out.println("2: Anime");
    }

    private static void producerMenu() {
        System.out.println("Type the number of your operation:");
        System.out.println("1: Search for Producer");
        System.out.println("2: Delete Producer");
        System.out.println("3: Save Producer");
        System.out.println("4: Update Producer");
        System.out.println("9: Return");
    }

    private static void animeMenu() {
        System.out.println("Type the number of your operation:");
        System.out.println("1: Search for Anime");
        System.out.println("2: Delete Anime");
        System.out.println("3: Save Anime");
        System.out.println("4: Update Anime");
        System.out.println("9: Return");
    }
}
