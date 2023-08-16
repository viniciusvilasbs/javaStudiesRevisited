package org.javaCore.polymorphism.service;

import org.javaCore.polymorphism.repository.Repository;

public class RepositoryMemory implements Repository {

    @Override
    public void save() {
        System.out.println("Salvando o arquivo em memória.");
    }
}
