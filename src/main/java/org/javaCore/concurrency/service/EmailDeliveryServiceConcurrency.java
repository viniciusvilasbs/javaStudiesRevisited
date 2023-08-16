package org.javaCore.concurrency.service;

import org.javaCore.concurrency.domain.MembersConcurrency;

public class EmailDeliveryServiceConcurrency implements Runnable {
    private final MembersConcurrency membersConcurrency;

    public EmailDeliveryServiceConcurrency(MembersConcurrency membersConcurrency) {
        this.membersConcurrency = membersConcurrency;
    }
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Começando a entregar os emails.");
        while (membersConcurrency.isOpen() || membersConcurrency.pendingEmails() > 0) {
            try {
                String email = membersConcurrency.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " enviando email para " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou email com sucesso para " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso!");
    }
}
