package org.javaCore.optionals.repository;

import org.javaCore.optionals.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = new ArrayList<>(List.of(new Manga (1, "Dragon Ball", 250),
            new Manga (2, "Evangelion", 13), new Manga (3, "YuYu Hakusho", 350)));



    public static Optional<Manga> findById(Integer id) {
        return findBy(manga -> manga.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title) {
        return  findBy(manga -> manga.getTitle().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
