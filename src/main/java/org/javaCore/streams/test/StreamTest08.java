package org.javaCore.streams.test;

import org.javaCore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Hellsing", 12.5),
            new LightNovel("YuYu Hakusho", 15.5), new LightNovel("Overlord", 9.99),
            new LightNovel("Attack on Titan", 11.89), new LightNovel("DeathNote", 8.99),
            new LightNovel("Bleach", 14.9), new LightNovel("Bleach", 14.9)));
    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 10)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        System.out.println("******************");

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 10)
                .sum();

        System.out.println(sum);
    }
}
