package org.javaCore.lambdas.service;

import org.javaCore.lambdas.domain.AnimeLambda;

public class AnimeComparator {
    public static int compareByTitleStatic(AnimeLambda a1, AnimeLambda a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisodesStatic(AnimeLambda a1, AnimeLambda a2) {
        return a1.getEpisodes().compareTo(a2.getEpisodes());
    }

    public int compareByTitleNonStatic(AnimeLambda a1, AnimeLambda a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public int compareByEpisodesNonStatic(AnimeLambda a1, AnimeLambda a2) {
        return a1.getEpisodes().compareTo(a2.getEpisodes());
    }
}
