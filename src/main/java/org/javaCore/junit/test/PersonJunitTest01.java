package org.javaCore.junit.test;

import lombok.extern.log4j.Log4j2;
import org.javaCore.junit.domain.PersonJunit;
import org.javaCore.junit.service.PersonJunitService;

@Log4j2
public class PersonJunitTest01 {
    public static void main(String[] args) {
        PersonJunit personJunit01 = new PersonJunit(15);

        PersonJunitService personJunitService = new PersonJunitService();

        log.info("Is adult? '{}'", personJunitService.isAdult(personJunit01));
    }
}
