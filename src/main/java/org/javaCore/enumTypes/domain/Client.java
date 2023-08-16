package org.javaCore.enumTypes.domain;

import org.javaCore.enumTypes.enums.ClientType;
import org.javaCore.enumTypes.enums.PaymentType;

public class Client {
    private String name;
    private ClientType clientType;
    private PaymentType paymentType;

    public Client(String name, ClientType clientType, PaymentType paymentType) {
        this.name = name;
        this.clientType = clientType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType.getReportName() +
                ", clientTypeNumber=" + clientType.getValue() +
                ", paymentType=" + paymentType +
                '}';
    }
}
