package org.javaCore.strings.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        concatString(30000);
        long stop = System.currentTimeMillis();
        System.out.println("Tempo gasto com STRING: " + (stop - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(1000000);
        stop = System.currentTimeMillis();
        System.out.println("Tempo gasto com STRINGBUILDER: " + (stop - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(1000000);
        stop = System.currentTimeMillis();
        System.out.println("Tempo gasto com STRINGBUFFER: " + (stop - start) + "ms");

    }

    public static void concatString(int size) {
        String text = "HelloWorld!";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    public static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }
}
