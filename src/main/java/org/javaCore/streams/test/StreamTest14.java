package org.javaCore.streams.test;

import org.javaCore.streams.domain.Category;
import org.javaCore.streams.domain.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Hellsing", 12.5, Category.HORROR),
            new LightNovel("YuYu Hakusho", 15.5, Category.ACTION), new LightNovel("Overlord", 9.99, Category.FANTASY),
            new LightNovel("Attack on Titan", 11.89, Category.ACTION), new LightNovel("DeathNote", 8.99, Category.HORROR),
            new LightNovel("Bleach", 14.9, Category.ACTION), new LightNovel("Bleach", 14.9, Category.ACTION),
            new LightNovel("Violet Evergarden", 9.9, Category.DRAMA), new LightNovel("Monogatari", 11.5, Category.ROMANCE)));
    public static void main(String[] args) {
        Map<Category, Long> lightNovelsCollect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(lightNovelsCollect);

        System.out.println("*****************************\n");

        Map<Category, Optional<LightNovel>> collect01 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect01);

        System.out.println("*****************************\n");

        Map<Category, LightNovel> collect02 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                        Optional::get)));
        System.out.println(collect02);
        System.out.println("*****************************\n");

//        sugestão do IntelliJ IDEA, faz o mesmo do collect02
        Map<Category, LightNovel> collect03 = lightNovels.stream().collect(
                Collectors.toMap(LightNovel::getCategory, Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect03);
    }
}
