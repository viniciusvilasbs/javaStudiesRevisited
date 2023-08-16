package org.javaCore.methods.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(20-5);
    }

    public void multiplyTwNumbers(int num01, int num02) {
        System.out.println(num01 * num02);
    }

    public double divideTwoNumbers(double num01, double num02) {
        if (num02 != 0) {
            double division = num01/num02;
            System.out.println(division);
            return division;
        }
        return 0.0;
    }

    public void printTwoNumbersDivision(double num01, double num02) {
        if (num02 == 0) {
            System.out.println("Não existe divisão por zero.");
            return;
        }
        System.out.println(num01/num02);
    }

    public void changeTwoNumbers(int num01, int num02) {
        num01 = 26;
        num02 = 55;
        System.out.println("Dentro do método Altera 2 Números:");
        System.out.println("Number01: " + num01);
        System.out.println("Number02: " + num02);
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Soma do VarArgs: " + sum);
    }
}
