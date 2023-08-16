package org.javaCore.associations.associationsChallengeExercise.test;

import org.javaCore.associations.associationsChallengeExercise.model.Seminar;
import org.javaCore.associations.associationsChallengeExercise.model.SeminarAddress;
import org.javaCore.associations.associationsChallengeExercise.model.Student;
import org.javaCore.associations.associationsChallengeExercise.model.Teacher;

public class ChallengeTest01 {
    public static void main(String[] args) {

        SeminarAddress seminarAddress01 = new SeminarAddress("Franca - SP, Brazil");
        Seminar seminar01 = new Seminar("English for Games", seminarAddress01);
        Seminar[] seminars = {seminar01};

        Student student01 = new Student("André",20, seminar01);
        Student student02 = new Student("Daniel", 20, seminar01);
        Student[] students = {student01, student02};
        seminar01.setStudents(students);

        Teacher teacher01 = new Teacher("Vinícius", "English", seminars);

        teacher01.printTeacher();
    }
}
