package org.javaCore.concurrency.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executando uma tarefa Callable...%n", Thread.currentThread().getName());
        }
        return String.format("%s terminou e o número aleatório é: %d", Thread.currentThread().getName(), count);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumberCallable);
        String futureGet = future.get();
        System.out.printf("Programa finalizado: %s", futureGet);
        executorService.shutdown();
    }
}
