package org.javaCore.exceptions.domain;

public class InvalidLoginException extends Exception {
    public InvalidLoginException() {
        super("Login inválido!");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
