package org.javaCore.ioFiles.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample\\bufferedwriter.txt");
        try(FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Testando o BufferedWriter no Java!");
            bufferedWriter.newLine(); //insere uma quebra de linha
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
