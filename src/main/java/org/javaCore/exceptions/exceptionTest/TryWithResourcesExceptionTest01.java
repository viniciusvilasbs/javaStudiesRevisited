package org.javaCore.exceptions.exceptionTest;

import java.io.*;

public class TryWithResourcesExceptionTest01 {
    public static void main(String[] args) {
//        readFile();
//        readFile2();
    }

    public static void  readFile() {
        try(Reader reader = new BufferedReader(new FileReader("test.txt"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  readFile2() {
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try{
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
