package org.javaCore.streams.test;

import org.javaCore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Hellsing", 12.5),
            new LightNovel("YuYu Hakusho", 15.5), new LightNovel("Overlord", 9.99),
            new LightNovel("Attack on Titan", 11.89), new LightNovel("DeathNote", 8.99),
            new LightNovel("Bleach", 14.9)));
    public static void main(String[] args) {
        List<String> titlesList = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(lightNovel -> lightNovel.getPrice() >= 10)
                .limit(4)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titlesList);
    }
}
