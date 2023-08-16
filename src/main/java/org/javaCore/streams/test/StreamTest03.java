package org.javaCore.streams.test;

import org.javaCore.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Hellsing", 12.5),
            new LightNovel("YuYu Hakusho", 15.5), new LightNovel("Overlord", 9.99),
            new LightNovel("Attack on Titan", 11.89), new LightNovel("DeathNote", 8.99),
            new LightNovel("Bleach", 14.9), new LightNovel("Bleach", 14.9)));
    public static void main(String[] args) {
        Stream<LightNovel> lightNovelStream = lightNovels.stream();

        lightNovels.forEach(System.out::println);
//        lightNovels.stream().forEach(System.out::println); // no stream também tem um método forEach, mas aqui usa mais processamento

        System.out.println("**********************");

        long count = lightNovelStream.distinct()
                .filter(lightNovel -> lightNovel.getPrice() >= 10)
                .count();

//        se o STREAM já tiver sido fechado, é necessário abrir ele novamente para continuar usando (raríssimo acontecer)!
//        Exemplo:
        /*
        long count2 = lightNovels.stream()
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() >= 10)
                .count();

        System.out.println(count2);
         */

        System.out.println("Quantidade de LightNovels mais caras do que R$10: " + count);
    }
}
