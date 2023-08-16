package org.javaCore.serialization.domain;

import java.io.*;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -7834520857498143237L;
    private Long id;
    private String name;
    private transient String password;
    private transient SchoolClass schoolClass;
    private static final String SCHOOL_NAME = "Java Programming School";

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private  void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(schoolClass.getName());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Serial
    private  void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String schoolClassName = ois.readUTF();
            schoolClass = new SchoolClass(schoolClassName);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", schoolClass='" + schoolClass + '\'' +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }
}
