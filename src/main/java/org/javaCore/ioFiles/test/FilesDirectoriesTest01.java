package org.javaCore.ioFiles.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FilesDirectoriesTest01 {
    public static void main(String[] args) {

        File fileDirectory = new File("C:\\temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample\\folderTest");

        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println(isDirectoryCreated);

        File createFileDirectory = new File(fileDirectory, "directoryFileTest.txt");

        try {
            boolean isCreated = createFileDirectory.createNewFile();
            System.out.println("Arquivo criado? " + isCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File renamedFile = new File(fileDirectory, "renamedDirectoryFileTest.txt");
        boolean isRenamed = createFileDirectory.renameTo(renamedFile);
        System.out.println("Arquivo renomeado? " + isRenamed);

        File directoryRenamed = new File("C:\\temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample\\renamedFolderTest");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("Pasta renomeada? " + isDirectoryRenamed);
    }
}
