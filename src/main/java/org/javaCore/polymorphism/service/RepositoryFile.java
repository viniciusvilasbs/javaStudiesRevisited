package org.javaCore.polymorphism.service;

import org.javaCore.polymorphism.repository.Repository;

public class RepositoryFile implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando o arquivo.");
    }
}
