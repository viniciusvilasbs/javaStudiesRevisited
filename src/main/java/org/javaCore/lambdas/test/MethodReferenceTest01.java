package org.javaCore.lambdas.test;

import org.javaCore.lambdas.domain.AnimeLambda;
import org.javaCore.lambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<AnimeLambda> animesList = new ArrayList<>(List.of(new AnimeLambda("Hellsing", 50), new AnimeLambda("Bleach", 300),
                new AnimeLambda("Dragon Ball Super", 150), new AnimeLambda("Evangelion", 13)));

//        Reference to a STATIC METHOD
//        Collections.sort(animesList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(animesList, AnimeComparator::compareByTitleStatic);
        System.out.println("Organizando por título: " + animesList);
        System.out.println("*************************");
        Collections.sort(animesList, AnimeComparator::compareByEpisodesStatic);
        System.out.println("Organizando por episódios: " + animesList);
    }
}
