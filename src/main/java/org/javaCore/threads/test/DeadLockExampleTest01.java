package org.javaCore.threads.test;

public class DeadLockExampleTest01 {
    public static void main(String[] args) {
        Object lock01 = new Object();
        Object lock02 = new Object();

        Runnable r1 = () -> {
            synchronized (lock01) {
                System.out.println("Thread01: Segurando lock 1");
                System.out.println("Thread01: Esperando lock 2");
                synchronized (lock02) {
                    System.out.println("Thread01: Segurando lock 2");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock02) {
                System.out.println("Thread02: Segurando lock 2");
                System.out.println("Thread02: Esperando lock 1");
                synchronized (lock01) {
                    System.out.println("Thread02: Segurando lock 1");
                }
            }
        };

//        new Thread(r1).start();
//        new Thread(r2).start();
    }
}
