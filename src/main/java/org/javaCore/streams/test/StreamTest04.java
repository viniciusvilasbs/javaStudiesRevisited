package org.javaCore.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojoCompany = new ArrayList<>();
        List<String> graphicDesigners = List.of("William", "Tania", "Francine", "Raul");
        List<String> developers = List.of("Vinícius", "Camila","Rafaela");
        List<String> students = List.of("Rafael", "Thais", "Francisco");

        devDojoCompany.add(graphicDesigners);
        devDojoCompany.add(developers);
        devDojoCompany.add(students);

        /*
        for (List<String> people : devDojoCompany) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        */

        devDojoCompany.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
