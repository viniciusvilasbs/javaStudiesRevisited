package org.javaCore.threads.test;

import org.javaCore.threads.domain.Members;
import org.javaCore.threads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread giban = new Thread(new EmailDeliveryService(members), "Giban");

        jiraya.start();
        giban.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email: ");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmails(email);
        }
    }
}
