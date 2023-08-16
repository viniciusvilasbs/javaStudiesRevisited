package org.javaCore.concurrency.test;

import org.javaCore.concurrency.domain.MembersConcurrency;
import org.javaCore.concurrency.service.EmailDeliveryServiceConcurrency;

import javax.swing.*;

public class EmailDeliveryConcurrencyTest01 {
    public static void main(String[] args) {
        MembersConcurrency membersConcurrency = new MembersConcurrency();

        Thread jiraya = new Thread(new EmailDeliveryServiceConcurrency(membersConcurrency), "Jiraya");
        Thread giban = new Thread(new EmailDeliveryServiceConcurrency(membersConcurrency), "Giban");

        jiraya.start();
        giban.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email: ");
            if (email == null || email.isEmpty()) {
                membersConcurrency.close();
                break;
            }
            membersConcurrency.addMemberEmails(email);
        }
    }
}
