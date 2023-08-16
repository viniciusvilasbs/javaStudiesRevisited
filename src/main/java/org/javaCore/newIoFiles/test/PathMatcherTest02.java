package org.javaCore.newIoFiles.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllJavaOrClassFiles extends SimpleFileVisitor<Path> {
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

        if (matcher.matches(file)) {
            System.out.println("Arquivos com TEST no nome: " + file.getFileName());
        }

       /*  AQUI ELE BUSCA TODOS OS ARQUIVOS .JAVA E .CLASS, sem filtrar apenas os que contém TEST no nome
       if (file.getFileName().toString().endsWith(".java")){
            System.out.println("Arquivos .java: " + file.getFileName());
       }

       if (file.getFileName().toString().endsWith(".class")) {
            System.out.println("Arquivos .class: " + file.getFileName());
       }
       */

       return FileVisitResult.CONTINUE;
    }

}
public class PathMatcherTest02 {
    public static void main(String[] args) {

        Path root = Paths.get(".");

        try {
            Files.walkFileTree(root, new ListAllJavaOrClassFiles());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
