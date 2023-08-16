package org.javaCore.polymorphism.test;

import org.javaCore.polymorphism.repository.Repository;
import org.javaCore.polymorphism.service.RepositoryDatabase;
import org.javaCore.polymorphism.service.RepositoryFile;
import org.javaCore.polymorphism.service.RepositoryMemory;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository01 = new RepositoryMemory();
        Repository repository02 = new RepositoryDatabase();
        Repository repository03 = new RepositoryFile();

        repository01.save();
        repository02.save();
        repository03.save();
    }
}
