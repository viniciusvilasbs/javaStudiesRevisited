package org.javaCore.junit.service;

import org.javaCore.junit.domain.PersonJunit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonJunitServiceTest {

    private PersonJunit personAdult;
    private PersonJunit personNotAdult;
    private PersonJunitService personJunitService;

    @BeforeEach
    public void setUp() {
        personAdult = new PersonJunit(18);
        personNotAdult = new PersonJunit(15);
        personJunitService = new PersonJunitService();
    }

    @Test
    @DisplayName("A person should not be ADULT when age is lower than 18.")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        assertFalse(personJunitService.isAdult(personNotAdult));
    }

    @Test
    @DisplayName("A person should be ADULT when age is 18 or higher.")
    void isAdult_ReturnTrue_WhenAgeIsEqualsOrHigherThan18() {
        assertTrue(personJunitService.isAdult(personAdult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void isAdult_ShouldThrowException_WhenPersonIsNull() {
        assertThrows(NullPointerException.class,
                () -> personJunitService.isAdult(null), "Person cannot be null!");
    }
}