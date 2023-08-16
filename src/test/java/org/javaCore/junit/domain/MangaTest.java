package org.javaCore.junit.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;
    private Manga manga3;
    @BeforeEach
    public void setUp() {
        manga1 = new Manga("Hellsing", 30);
        manga2 = new Manga("Dragon Ball", 500);
        manga3 = new Manga("Dragon Ball", 500);
    }

    @Test
    public void accessors_ReturnData_WhenInitialized() {
        assertEquals("Hellsing", manga1.name());
        assertEquals(30, manga1.episodes());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame() {
        assertEquals(manga2, manga3);
    }

    @Test
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame() {
        assertEquals(manga2.hashCode(), manga3.hashCode());
    }

    @Test
    public void constructor_ThrowsNullPointerExeption_WhenNameIsNull() {
        assertThrows(NullPointerException.class, () -> new Manga(null, 38));
    }

    @Test
    public void isRecord_ReturnTrue_WhenCalledFromManga() {
        assertTrue(Manga.class.isRecord());
    }
}