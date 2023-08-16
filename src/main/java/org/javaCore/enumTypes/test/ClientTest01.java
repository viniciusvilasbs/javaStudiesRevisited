package org.javaCore.enumTypes.test;

import org.javaCore.enumTypes.enums.ClientType;
import org.javaCore.enumTypes.enums.PaymentType;
import org.javaCore.enumTypes.domain.Client;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client01 = new Client("Vinícius", ClientType.PESSOA_FISICA, PaymentType.DEBITO);
        Client client02 = new Client("Camila", ClientType.PESSOA_FISICA, PaymentType.CREDITO);
        Client client03 = new Client("Tech English", ClientType.PESSOA_JURIDICA, PaymentType.CREDITO);


        System.out.println(client01);
        System.out.println(client02);
        System.out.println(client03);
        System.out.println(PaymentType.DEBITO.calculateDiscount(850));
        System.out.println(PaymentType.CREDITO.calculateDiscount(850));
    }
}
