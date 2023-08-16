package org.javaCore.designPatterns.test;

import org.javaCore.designPatterns.domain.builder.PersonBuild;
import org.javaCore.designPatterns.domain.factory.PersonFactory;

public class BuilderPatternTest01 {
    public static void main(String[] args) {

//        Builder pattern:
        PersonBuild buildPerson = new PersonBuild.PersonBuildBuilder()
                .firstName("Vinícius")
                .lastName("Silva")
                .userName("Vinymax")
                .email("vinicius@email.com")
                .build();

        System.out.println(buildPerson);

//        Factory pattern:
        PersonFactory personFactory = PersonFactory.PersonFactoryBuilder
                .builder()
                .firstName("Vinícius")
                .lastName("Silva")
                .userName("Vinymax")
                .email("vinicius@email.com")
                .build();

        System.out.println(personFactory);
    }
}
