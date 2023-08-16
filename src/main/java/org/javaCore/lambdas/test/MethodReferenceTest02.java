package org.javaCore.lambdas.test;

import org.javaCore.lambdas.domain.AnimeLambda;
import org.javaCore.lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<AnimeLambda> animesList = new ArrayList<>(List.of(new AnimeLambda("Hellsing", 50), new AnimeLambda("Bleach", 300),
                new AnimeLambda("Dragon Ball Super", 150), new AnimeLambda("Evangelion", 13)));

        AnimeComparator animeComparator = new AnimeComparator();


//        Reference to an INSTANCE METHOD OF A PARCITULAR OBJECT (non static)
        animesList.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println("Organizando por título: " + animesList);
        System.out.println("*************************");
        animesList.sort(animeComparator::compareByTitleNonStatic);
        System.out.println("Organizando por episódios: " + animesList);
    }
}
