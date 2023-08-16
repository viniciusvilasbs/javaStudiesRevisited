package org.javaCore.newIoFiles.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) {
        Path folderPath = Paths.get("filesExamplePath");
        if (Files.notExists(folderPath)) {
            try {
                Path folderDirectory = Files.createDirectory(folderPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Path subFolderPath = Paths.get("filesExamplePath/subfolder01/subfolder02");
        try {
            Path subFolderDirectory = Files.createDirectories(subFolderPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path filePath = Paths.get(subFolderPath.toString(), "subFolderFileExample.txt");

        if (Files.notExists(filePath)){
            try {
                Path filePathCreated = Files.createFile(filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "renamedSubFolderFileExample.txt");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
