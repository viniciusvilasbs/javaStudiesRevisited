package org.javaCore.concurrency.test;

import java.util.concurrent.locks.ReentrantLock;

class WorkerReentrant implements Runnable {
    private String name;
    private ReentrantLock lock;

    public WorkerReentrant(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.printf("Thread %s entrou em uma sessão crítica\n", name);
            System.out.printf("%d Threads esperando na fila%n", lock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera%n", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);

        new Thread(new WorkerReentrant("A", lock)).start();
        new Thread(new WorkerReentrant("B", lock)).start();
        new Thread(new WorkerReentrant("C", lock)).start();
        new Thread(new WorkerReentrant("D", lock)).start();
        new Thread(new WorkerReentrant("E", lock)).start();
        new Thread(new WorkerReentrant("F", lock)).start();
        new Thread(new WorkerReentrant("G", lock)).start();
    }
}
