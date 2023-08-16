package org.javaCore.streams.test;

import org.javaCore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Hellsing", 12.5),
            new LightNovel("YuYu Hakusho", 15.5), new LightNovel("Overlord", 9.99),
            new LightNovel("Attack on Titan", 11.89), new LightNovel("DeathNote", 8.99),
            new LightNovel("Bleach", 14.9), new LightNovel("Bleach", 14.9)));
    public static void main(String[] args) {
//        para contar os itens:
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));
        System.out.println("******************");

//        comparando para retornar o maior
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
        System.out.println("******************");

//        somando os valores
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));
        System.out.println("******************");

//        para retornar a média dos valores
        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
        System.out.println("******************");

//        retornando todos os dados estatísticos
        DoubleSummaryStatistics summaryStatistics = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(summaryStatistics);
        System.out.println("******************");

//        retornando os títulos de uma vez, separando por ", "
        String titlesList = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titlesList);
    }
}
