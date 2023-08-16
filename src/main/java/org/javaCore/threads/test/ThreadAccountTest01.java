package org.javaCore.threads.test;

import org.javaCore.threads.domain.Account;

public class ThreadAccountTest01 implements Runnable{
    private Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Thread01");
        Thread t2 = new Thread(threadAccountTest01, "Thread02");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10);
            if (account.getBalance() < 0) {
                System.out.println("Conta no vermelho! Não há valor disponível para saque!");
            }
        }
    }

    private synchronized void withdraw(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " está indo sacar o dinheiro.");
            account.withdraw(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque. Valor disponível: " + account.getBalance());
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
