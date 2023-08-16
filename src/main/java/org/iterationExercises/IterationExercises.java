package org.iterationExercises;

import java.util.Scanner;

public class IterationExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double carValue;
        double monthQuantity;
        double monthlyValue;

        System.out.println("Digite o valor do carro: ");
        carValue = scan.nextDouble();

        for (monthQuantity = 1; monthQuantity <= carValue; monthQuantity++) {
            monthlyValue = carValue / monthQuantity;
            if (monthlyValue < 1000 ) {
                System.out.println("O valor da prestação ficou abaixo de R$1000,00. Não pode ser mais dividido.");
                break;
            }
            System.out.println("O carro pode ser dividido em " + monthQuantity +
                    " meses. Cada parcela fica no valor R$ " +monthlyValue);
        }
        scan.close();
    }
}
