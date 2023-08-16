package org.javaCore.regularExpressions.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Vinicius, Camila, Francine, Raul, Tania";
        String[] names = text.split(",");
        for (String name: names) {
            System.out.println("Nome: " + name.trim());
        }
    }
}
