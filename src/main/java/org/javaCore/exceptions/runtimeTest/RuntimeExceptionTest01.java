package org.javaCore.exceptions.runtimeTest;

import java.io.File;
import java.io.IOException;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
//        createNewFile();
    }

    public static void createNewFile() throws IOException {
        File file = new File("file\\test.txt");

//        IOException if the file isn't created
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
