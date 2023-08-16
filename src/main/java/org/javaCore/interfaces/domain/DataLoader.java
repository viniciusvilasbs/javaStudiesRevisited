package org.javaCore.interfaces.domain;

public interface DataLoader {
    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões.");
    }

    static void retrieveDataMaxSize() {
        System.out.println("Dentro do retrieveDataMaxSize na interface: DataLoader.");
    }
}
