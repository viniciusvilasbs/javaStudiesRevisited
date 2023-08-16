package org.javaCore.regularExpressions.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Vinicius,true,Camila,false,Francine,51276,Raul,Tania,200";
        Scanner scan = new Scanner(text);
        scan.useDelimiter(",");

        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                int i = scan.nextInt();
                System.out.println("int: " + i);
            } else if (scan.hasNextBoolean()) {
                boolean b = scan.nextBoolean();
                System.out.println("boolean: " + b);
            } else {
                System.out.println("Nome: " + scan.next());
            }
        }
    }
}
