package org.javaCore.serialization.test;

import org.javaCore.serialization.domain.SchoolClass;
import org.javaCore.serialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Vinícius", "123456");
        SchoolClass schoolClass = new SchoolClass("Maratona Java virado no Jiraya");
        student.setSchoolClass(schoolClass);
//        serialize(student);
//        deserialize();
    }

    private static void serialize(Student student) {
        Path path = Paths.get("filesExample/student.serial");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
            System.out.println("Success: Object serialized!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserialize() {
        Path path = Paths.get("filesExample/student.serial");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
            System.out.println("Success: Object deserialized!");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

