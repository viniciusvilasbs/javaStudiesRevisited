package org.javaCore.innerClasses.test;

public class OuterAndStaticNestedClassesTest01 {
    private String name = "Vinícius";

    static class Nested {
        private String lastName = "Silva";

        void print() {
            System.out.println(new OuterAndStaticNestedClassesTest01().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
