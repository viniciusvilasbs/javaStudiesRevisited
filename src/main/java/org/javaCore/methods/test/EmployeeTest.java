package org.javaCore.methods.test;

import org.javaCore.methods.domain.Employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee employee01 = new Employee();

        employee01.setName("Vinícius");
        employee01.setAge(36);
        employee01.setSalaries(new double[]{3000, 3500, 4500});
//        employee01.salaries[0] = 3000;
//        employee01.salaries[1] = 3500;
//        employee01.salaries[2] = 4500;
        employee01.printEmployee();

        scan.close();
    }
}
