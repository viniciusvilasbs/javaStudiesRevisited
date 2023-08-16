package org.javaCore.streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>(List.of("Vinicius", "Camila", "Raul", "Rafaela", "Aurora"));

        /*
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = words.stream()
                .map(word -> word.split(""))
                .collect(Collectors.toList());
       */

        List<String> letters2 = wordsList.stream()
                .map(words -> words.split("")) // retorna Stream<String[]>
                .flatMap(Arrays::stream)    // retorna Stream<String>
                .collect(Collectors.toList());

        System.out.println(letters2);
    }
}
