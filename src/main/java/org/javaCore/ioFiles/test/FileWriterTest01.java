package org.javaCore.ioFiles.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample\\filewriter.txt");
        try(FileWriter fileWriter = new FileWriter(file, true)) { //colocando o boolean append o arquivo mantem as informações anteriores e depois adiciona as novas
            fileWriter.write("Testando o FileWriter no Java!");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
