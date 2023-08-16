package org.javaCore.streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        System.out.println("Iterando soma +2: \n");
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("***********************\n");

        System.out.println("Sequencia 1 de Fibonacci: \n");
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(20)
                .forEach(n -> System.out.println(Arrays.toString(n)));

        System.out.println("***********************\n");


        System.out.println("Sequencia 2 de Fibonacci: \n");
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(20)
                .map(n -> n[0])
                .forEach(System.out::println);

        System.out.println("***********************\n");

        System.out.println("Gerando números randomicos: \n");
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 1000000))
                .limit(90)
                .forEach(System.out::println);
    }
}
