package org.javaCore.associations.associationsChallengeExercise.model;

public class Teacher {
    private String name;
    private String expertize;
    private Seminar[] seminars;

    public Teacher() {
    }

    public Teacher(String name, String expertize) {
        this.name = name;
        this. expertize = expertize;
    }

    public Teacher(String name, String expertize, Seminar[] seminars) {
        this(name, expertize);
        this.seminars = seminars;
    }

    public void printTeacher() {

        System.out.println("********************************************************");
        System.out.println("Informações sobre o professor: ");
        System.out.println("Nome: " + name);
        System.out.println("Especialidade: " + expertize);

        if (seminars == null) {
            System.out.println("O professor não ministrará nenhum seminário!");
            return;
        }
        for (Seminar seminar: seminars) {
            System.out.println("O professor ministrará os seminários: \n");
            seminar.printSeminar();
            System.out.println("********************************************************");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setExpertize(String expertize) {
        this.expertize = expertize;
    }
}
