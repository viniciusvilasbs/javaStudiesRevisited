package org.javaCore.polymorphism.service;

import org.javaCore.polymorphism.repository.Repository;

public class RepositoryDatabase implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando o arquivo no banco de dados.");
    }
}
