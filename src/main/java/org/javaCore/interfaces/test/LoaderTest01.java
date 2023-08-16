package org.javaCore.interfaces.test;

import org.javaCore.interfaces.domain.DataLoader;
import org.javaCore.interfaces.domain.DatabaseLoader;
import org.javaCore.interfaces.domain.FileLoader;

public class LoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveDataMaxSize();
        DatabaseLoader.retrieveDataMaxSize();
    }
}
