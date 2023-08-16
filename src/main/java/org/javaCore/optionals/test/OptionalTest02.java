package org.javaCore.optionals.test;

import org.javaCore.optionals.domain.Manga;
import org.javaCore.optionals.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Dragon Ball");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Dragon Ball Z"));
        System.out.println(mangaByTitle);

        System.out.println("**************************");

        Optional<Manga> mangaByTitle2 = MangaRepository.findByTitle("Dragon Boll");
        mangaByTitle2.ifPresent(manga -> manga.setTitle("Dragon Ball Z"));
        System.out.println(mangaByTitle2);

        System.out.println("**************************");

        Manga mangaById = MangaRepository.findById(3).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        System.out.println("**************************");

        Manga newManga = MangaRepository.findByTitle("Attack on Titan").orElseGet(() -> new Manga(4,"Attack on titan", 500));
        System.out.println(newManga);
    }
}
