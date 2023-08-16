package org.javaCore.methods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public void printEmployee() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);

        if (salaries == null) {
            System.out.println("Funcionário sem salários!");
            return;
        }
        for (double salary : this.salaries) {
            System.out.println("Salários : R$" + salary);
        }
//        System.out.println("Salário 1: R$" + this.salary[0]);
//        System.out.println("Salário 2: R$" + this.salary[1]);
//        System.out.println("Salário 3: R$" + this.salary[2]);
        printAverageSalary();
    }

    public void printAverageSalary() {
        if (salaries == null) {
            System.out.println("Funcionário sem salários! Não é possível calcular a média!");
            return;
        }

        for (double salary : this.salaries) {
            average += salary;
        }
        average /= salaries.length;
//        double average = (this.salaries[0] + this.salaries[1] + this.salaries[2]) / this.salaries.length;
        System.out.printf("Média dos salários: R$%.2f %n", average);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double[] getSalaries() {
        return this.salaries;
    }

    public double getAverage() {
        return this.average;
    }
}