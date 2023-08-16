package org.javaCore.enumTypes.enums;

import org.w3c.dom.ls.LSOutput;

public enum ClientType {
    PESSOA_FISICA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");

    private int value;
    private String reportName;
    ClientType(int value, String reportName) {
        this.value = value;
        this.reportName = reportName;
    }

    public static ClientType clientTypeByReportName(String reportName) {
        for (ClientType clientType : values()) {
            if (clientType.getReportName().equalsIgnoreCase(reportName)) {
                return clientType;
            }
        }
        return null;
    }

    public String getReportName() {
        return this.reportName;
    }

    public int getValue() {
        return this.value;
    }
}
