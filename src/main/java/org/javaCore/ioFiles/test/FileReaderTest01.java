package org.javaCore.ioFiles.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\intelliJ_idea\\JavaStudiesRevisited\\filesExample\\filewriter.txt");
        try(FileReader fileReader = new FileReader(file)) {
//            char[] in = new char[30];
//            fileReader.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i= fileReader.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
