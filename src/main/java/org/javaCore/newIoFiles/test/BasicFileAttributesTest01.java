package org.javaCore.newIoFiles.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) {
//        BasicFileAttribute, DosFileAttribute, PosixFileAttribute
        LocalDateTime dateTime = LocalDateTime.now().minusDays(10);
        File file = new File("C:\\temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample\\basicAttributeFile.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File foi criado? " + isCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        boolean isModified = file.setLastModified(dateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println("File foi modificado? " + isModified);

        Path path = Paths.get("C:\\temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample\\basicAttributeFilePath.txt");
        try {
            Files.createFile(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileTime fileTime = FileTime.from(dateTime.toInstant(ZoneOffset.UTC));
        try {
            Files.setLastModifiedTime(path, fileTime);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Pode escrever? " + Files.isWritable(path));
        System.out.println("Pode ler? " + Files.isReadable(path));
        System.out.println("Pode executar? " + Files.isExecutable(path));
    }
}
