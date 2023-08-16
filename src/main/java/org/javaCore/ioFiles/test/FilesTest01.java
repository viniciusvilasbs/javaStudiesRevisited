package org.javaCore.ioFiles.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FilesTest01 {
    public static void main(String[] args) {
//        File
//        FileWriter
//        FileReader
//        BufferedWriter
//        BufferedReader

        File file = new File("C:\\temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample\\file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Criado: " + isCreated);
            System.out.println("Caminho do aquivo: " + file.getPath());
            System.out.println("Caminho absoluto do arquivo: " + file.getAbsolutePath());
            System.out.println("Última modificação: " + new Date(file.lastModified()));
            System.out.println("Última modificação (mais atual): " +
                    Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());

            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deletado: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
