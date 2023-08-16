package org.javaCore.streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter((n -> n % 2 == 0)).forEach(n -> System.out.print(n + " ")); //inclui o último número
        System.out.println("\n************");
        IntStream.range(1,50).filter((n -> n % 2 == 0)).forEach(n -> System.out.print(n + " ")); // não inclui o último número
        System.out.println("\n************");

        Stream.of("\nEleve ", "o ", "cosmo ", "no ", "seu ", "coração!")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s));

        System.out.println("\n************");

        int num[] = {1,2,3,4,5,6,7,8,9};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);
        System.out.println("\n************");

//        trabalhando com arquivos
        try(Stream<String> lines = Files.lines(Paths.get("filesExample/basicAttributeFile.txt"))) {
            lines
                    .filter(line -> line.contains("Java"))
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
