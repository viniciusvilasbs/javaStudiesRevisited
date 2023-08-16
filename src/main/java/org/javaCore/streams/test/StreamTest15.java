package org.javaCore.streams.test;

import org.javaCore.streams.domain.Category;
import org.javaCore.streams.domain.LightNovel;
import org.javaCore.streams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Hellsing", 12.5, Category.HORROR),
            new LightNovel("YuYu Hakusho", 15.5, Category.ACTION), new LightNovel("Overlord", 9.99, Category.FANTASY),
            new LightNovel("Attack on Titan", 11.89, Category.ACTION), new LightNovel("DeathNote", 8.99, Category.HORROR),
            new LightNovel("Bleach", 14.9, Category.ACTION), new LightNovel("Bleach", 14.9, Category.ACTION),
            new LightNovel("Violet Evergarden", 9.9, Category.DRAMA), new LightNovel("Monogatari", 11.5, Category.ROMANCE)));
    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect01 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect01);
        System.out.println("******************************\n");

        Map<Category, Set<Promotion>> collect02 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println("To Set: ");
        System.out.println(collect02);
        System.out.println("******************************\n");

        Map<Category, LinkedHashSet<Promotion>> collect03 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println("LinkedHashSet: ");
        System.out.println(collect03);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 10 ? Promotion.UNDER_PROMOTION : Promotion.REGULAR_PRICE;
    }
}
