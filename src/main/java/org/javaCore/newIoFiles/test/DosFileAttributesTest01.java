package org.javaCore.newIoFiles.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("filesExamplePath/dosFileAttributesTest.txt");

        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);

        System.out.println("Está oculto? " + dosFileAttributes.isHidden());
        System.out.println("Somente leitura? " + dosFileAttributes.isHidden());
        System.out.println("*********************");

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);

        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);
        System.out.println("Está oculto? " + fileAttributeView.readAttributes().isHidden());
        System.out.println("Somente leitura? " + fileAttributeView.readAttributes().isHidden());
        System.out.println("*********************");
        fileAttributeView.setHidden(false);
        fileAttributeView.setReadOnly(false);
        System.out.println("Está oculto? " + fileAttributeView.readAttributes().isHidden());
        System.out.println("Somente leitura? " + fileAttributeView.readAttributes().isHidden());
    }
}
