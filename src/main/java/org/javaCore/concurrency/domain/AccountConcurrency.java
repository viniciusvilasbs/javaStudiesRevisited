package org.javaCore.concurrency.domain;

public class AccountConcurrency {
    private int balance = 50;

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
