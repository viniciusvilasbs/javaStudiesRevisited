package org.javaCore.junit.service;

import org.javaCore.junit.domain.PersonJunit;

import java.util.Objects;

public class PersonJunitService {
    public boolean isAdult(PersonJunit personJunit) {
        Objects.requireNonNull(personJunit, "Person cannot be null");
        return personJunit.getAge() >= 18;
    }
}
