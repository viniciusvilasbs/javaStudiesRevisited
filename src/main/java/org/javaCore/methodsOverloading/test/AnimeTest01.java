package org.javaCore.methodsOverloading.test;

import org.javaCore.methodsOverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z","TV",12);
//        anime.setName("Dragon Ball Z");
//        anime.setType("TV");
//        anime.setEpisode(12);
        anime.printAnime();
    }
}
