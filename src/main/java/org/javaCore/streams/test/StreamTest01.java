package org.javaCore.streams.test;

import org.javaCore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Hellsing", 12.5),
            new LightNovel("YuYu Hakusho", 15.5), new LightNovel("Overlord", 9.99),
            new LightNovel("Attack on Titan", 11.89), new LightNovel("DeathNote", 8.99),
            new LightNovel("Bleach", 14.9)));
    public static void main(String[] args) {

        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titlesList = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 10 ) {
                titlesList.add(lightNovel.getTitle());
            }
            if (titlesList.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println("****************");
        System.out.println(titlesList);
    }
}
