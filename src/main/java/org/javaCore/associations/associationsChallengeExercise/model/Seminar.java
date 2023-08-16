package org.javaCore.associations.associationsChallengeExercise.model;

public class Seminar {
    private String title;
    private SeminarAddress address;
    private Student[] students;

    public Seminar() {
    }

    public Seminar(String title, SeminarAddress address) {
        this.title = title;
        this.address = address;
    }
    public Seminar(String title, SeminarAddress address, Student[] students) {
        this(title, address);
        this.students = students;
    }

    public void printSeminar() {

        System.out.println("Informações do seminário: ");
        System.out.println("Seminário: " + title);

        if (address == null) {
            System.out.println("Seminário sem endereço cadastrado! Favor cadastrar!");
            return;
        }
        System.out.println("Local: " + address.getAddress() + "\n");

        if (students == null) {
            System.out.println("Não há alunos matriculados no seminário!");
            return;
        }
        for (Student student: students) {
            System.out.println("Estudantes matriculados: ");
            student.printStudent();
//            System.out.println("Estudantes: " + student.getName());
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public  String getTitle() {
        return this.title;
    }

    public SeminarAddress getAddress() {
        return address;
    }

    public void setAddress(SeminarAddress address) {
        this.address = address;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
