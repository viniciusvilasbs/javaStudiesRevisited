package org.javaCore.associations.test;

import java.util.Scanner;

public class InputTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String question;
        String decision;
        boolean keepAsking = true;

        System.out.println("O grande software de previsão do futuro está aqui!");

        while (keepAsking != false) {
            System.out.println("Digite sua pergunta. Responderei SIM ou NÃO apenas!");
            question = scan.nextLine();

            if (question.charAt(0) == ' ') {
                System.out.println("SIM!");
            } else {
                System.out.println("NÃO!");
            }

            System.out.println();
            System.out.println("Deseja perguntar outra coisa? (Digite SIM ou NAO)");
            decision = scan.nextLine();

            while (!decision.equalsIgnoreCase("sim") && !decision.equalsIgnoreCase("nao")
                        && !decision.equalsIgnoreCase("não")) {
                System.out.println("Resposta inválida. Digite novamente.");
                System.out.println("Deseja perguntar outra coisa? (Digite SIM ou NAO)");
                decision = scan.nextLine();
            }


            if (decision.equalsIgnoreCase("nao") || decision.equalsIgnoreCase("não")){
                keepAsking = false;
            }
        }

        System.out.println();
        System.out.println("Muito bem! Não responderei mais nenhuma pergunta! Adeus!");

        scan.close();
    }
}
