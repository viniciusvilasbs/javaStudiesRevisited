package org.javaCore.innerClasses.test;

public class OuterAndLocalClassesTest02 {
    private String name = "Vinicius";

    void print() {
        final String lastName = "Silva";

        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal(); // se usar uma classe local (dentro de um método) é necessário
                                        // instanciar ela dentro do método
    }
    public static void main(String[] args) {
        OuterAndLocalClassesTest02 outer = new OuterAndLocalClassesTest02();
        outer.print();
    }
}
