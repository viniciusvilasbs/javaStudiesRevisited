package org.javaCore.interfaces.domain;

public class DatabaseLoader implements DataLoader,DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados.");
    }

    public static void retrieveDataMaxSize() {
        System.out.println("Dentro do retrieveDataMaxSize na classe: DatabaseLoader.");
    }
}
