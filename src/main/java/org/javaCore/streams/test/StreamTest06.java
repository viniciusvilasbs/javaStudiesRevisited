package org.javaCore.streams.test;

import org.javaCore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Hellsing", 12.5),
            new LightNovel("YuYu Hakusho", 15.5), new LightNovel("Overlord", 9.99),
            new LightNovel("Attack on Titan", 11.89), new LightNovel("DeathNote", 8.99),
            new LightNovel("Bleach", 14.9), new LightNovel("Bleach", 14.9)));
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice() < 8));

        System.out.println("*********************");

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 8)
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("*********************");

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 8)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("*******************");

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 8)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
