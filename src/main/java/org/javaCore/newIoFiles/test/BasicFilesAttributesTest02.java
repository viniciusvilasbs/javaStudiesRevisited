package org.javaCore.newIoFiles.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("filesExample/renamedFolderTest/basicFileAttribute2File.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Creation time " + creationTime);
        System.out.println("Last modified time " + lastModifiedTime);
        System.out.println("Last access time " + lastAccessTime);
        System.out.println("************************");

//        BasicFileAttributeView, DosFileAttributeView, PosixFileAttributeView ---> as classes com
//                              VIEW permitem modificar o arquivo

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Creation time " + creationTime);
        System.out.println("Last modified time " + lastModifiedTime);
        System.out.println("Last access time " + lastAccessTime);
    }
}
