package org.javaCore.constructors.test;


import org.javaCore.constructors.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z","TV","Ação",12);
        Anime anime2 = new Anime();
//        anime.setName("Dragon Ball Z");
//        anime.setType("TV");
//        anime.setEpisode(12);
        anime.printAnime();
        anime2.printAnime();
    }
}
