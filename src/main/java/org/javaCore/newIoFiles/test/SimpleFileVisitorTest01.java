package org.javaCore.newIoFiles.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) {
        Path root = Paths.get(".");

        try {
            Files.walkFileTree(root, new ListAllJavaFiles());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
