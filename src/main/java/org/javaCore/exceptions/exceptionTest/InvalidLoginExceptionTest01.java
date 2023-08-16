package org.javaCore.exceptions.exceptionTest;

import org.javaCore.exceptions.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {

//        try {
//            logIn();
//        } catch (InvalidLoginException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void logIn() throws InvalidLoginException {
        Scanner scan = new Scanner(System.in);

        String userNameDB = "Vinicius";
        String passwordDB = "java";
        System.out.println("Usuário: ");
        String typedUserName = scan.nextLine();
        System.out.println("Senha: ");
        String typedPassword = scan.nextLine();

        if (!userNameDB.equals(typedUserName) || !passwordDB.equals(typedPassword)) {
            throw new InvalidLoginException("Usuário ou senha inválidos!");
        }

        System.out.println("Usuário logado com sucesso!");

        scan.close();
    }
}
