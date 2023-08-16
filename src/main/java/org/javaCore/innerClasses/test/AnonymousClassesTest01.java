package org.javaCore.innerClasses.test;

class AnonymousAnimal {
    public void walk() {
        System.out.println("Animal walking.");
    }
}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        AnonymousAnimal anonymousAnimal = new AnonymousAnimal() {
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        anonymousAnimal.walk();
    }
}
