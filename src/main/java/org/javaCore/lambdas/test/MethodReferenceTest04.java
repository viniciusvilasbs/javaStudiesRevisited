package org.javaCore.lambdas.test;

import org.javaCore.lambdas.domain.AnimeLambda;
import org.javaCore.lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> newAnimeComparator = AnimeComparator::new;
        AnimeComparator animeComparator = new AnimeComparator();

        List<AnimeLambda> animesList = new ArrayList<>(List.of(new AnimeLambda("Hellsing", 50), new AnimeLambda("Bleach", 300),
                new AnimeLambda("Dragon Ball Super", 150), new AnimeLambda("Evangelion", 13)));

//        Reference to A CONSTRUCTOR
        animesList.sort(animeComparator::compareByTitleNonStatic);
        System.out.println("Organizando a lista por nome: " + animesList);
        System.out.println("*******************\n");

//        BiFunction<String, Integer, AnimeLambda> animeLambdaBiFunction1 =
//                                                    (title, episodes) -> new AnimeLambda(title, episodes);
        BiFunction<String, Integer, AnimeLambda> animeLambdaBiFunction2 = AnimeLambda::new;

        System.out.println("Adicionando novo anime com BiFunction!" + animesList.add(animeLambdaBiFunction2.apply("Chainsaw Man", 35)));
        System.out.println("*******************\n");
        System.out.println("Lista completa: " + animesList);
    }
}
