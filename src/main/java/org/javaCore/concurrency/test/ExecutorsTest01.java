package org.javaCore.concurrency.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class PrinterExecutor implements Runnable {
    private final int number;

    public PrinterExecutor(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.printf("%s iniciou: %d%n", Thread.currentThread().getName(), number);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s finalizou%n", Thread.currentThread().getName());
    }
}

public class ExecutorsTest01 {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = Executors.newCachedThreadPool(); //cria Threads quando necessário, mas reutiliza
//                                                                            as Threads que estão ociosas

        executorService.execute(new PrinterExecutor(1));
        executorService.execute(new PrinterExecutor(2));
        executorService.execute(new PrinterExecutor(3));
        executorService.execute(new PrinterExecutor(4));
        executorService.execute(new PrinterExecutor(5));
        executorService.execute(new PrinterExecutor(6));

        executorService.shutdown();

        System.out.println("Programa finalizado!");
    }
}
