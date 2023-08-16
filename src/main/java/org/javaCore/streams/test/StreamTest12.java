package org.javaCore.streams.test;

import org.javaCore.streams.domain.Category;
import org.javaCore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Hellsing", 12.5, Category.HORROR),
            new LightNovel("YuYu Hakusho", 15.5, Category.ACTION), new LightNovel("Overlord", 9.99, Category.FANTASY),
            new LightNovel("Attack on Titan", 11.89, Category.ACTION), new LightNovel("DeathNote", 8.99, Category.HORROR),
            new LightNovel("Bleach", 14.9, Category.ACTION), new LightNovel("Bleach", 14.9, Category.ACTION),
            new LightNovel("Violet Evergarden", 9.9, Category.DRAMA), new LightNovel("Monogatari", 11.5, Category.ROMANCE)));
    public static void main(String[] args) {
        Map<Category, List<LightNovel>> groupByCategory = lightNovels.stream()
                                                            .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(groupByCategory);
    }
}
