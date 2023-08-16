package org.javaCore.threads.test;

class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
//            YIELD: Indicação para que a Thread em execução dê uma pausa (NÃO HÁ GARANTIA QUE IRÁ FUNCIONAR)
//            Thread.yield();
        }
    }
}
public class ThreadsTest02 {
    public static void main(String[] args) throws InterruptedException {
       Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
       Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));

       t1.setPriority(Thread.MAX_PRIORITY);
       t1.start();
//       o JOIN não deixa a outra Thread começar antes que a determinada por ele termine
       t1.join();
       t2.start();

    }
}
