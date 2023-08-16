package org.javaCore.associations.associationsChallengeExercise.model;

public class Student {
    private String name;
    private int age;
    private Seminar seminar;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminar seminar) {
        this(name, age);
        this.seminar = seminar;
    }

    public void printStudent() {

        System.out.println("Informações do Aluno(a): ");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        if (seminar == null) {
            System.out.println("O aluno não está matriculado em nenhum seminário!");
            return;
        }
        System.out.println("Matriculado no seminário: " + seminar.getTitle() + "\n");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
