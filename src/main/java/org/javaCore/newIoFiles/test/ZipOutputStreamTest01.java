package org.javaCore.newIoFiles.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("filesExample/zipFileTest.zip");
        Path filesToZip = Paths.get("filesExamplePath/subfolder01/subfolder02");

        zip(zipFile, filesToZip);
    }

    private static void zip(Path zipFile, Path filesToZip) {

        try(ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip)) {
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(file, zipOutputStream);
                zipOutputStream.closeEntry();
            }
            System.out.println("Arquivo zip criado com sucesso!");
            System.out.println("Arquivo salvo em: " + filesToZip.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
