package org.javaCore.abstractClasses.test;

import org.javaCore.abstractClasses.domain.Developer;
import org.javaCore.abstractClasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager01 = new Manager("Camila", 5000);
        Developer developer01 = new Developer("Vinícius", 12000);

        System.out.println(manager01.toString());
        System.out.println(developer01.toString());
    }
}
