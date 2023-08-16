package org.javaCore.innerClasses.test;

public class OuterAndInnerClassesTest01 {
    private String name = "Vinícius";

//    Nested class
    class InnerClass {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); // o this sempre chama a classe onde ele se encontra
            System.out.println(OuterAndInnerClassesTest01.this); // assim se chama o this da outer class
        }
    }

    public static void main(String[] args) {
        OuterAndInnerClassesTest01 outerClass = new OuterAndInnerClassesTest01();
//        OuterAndInnerClassesTest01.InnerClass innerClass = outerClass.new InnerClass(); // chamando a classe interna
        InnerClass innerClass1 = outerClass.new InnerClass(); // outra maneira de chamar a classe interna
        InnerClass innerClass2 = new OuterAndInnerClassesTest01().new InnerClass();// mais uma maneira de chamar a classe interna

        innerClass1.printOuterClassAttribute();
        innerClass2.printOuterClassAttribute();
    }
}
