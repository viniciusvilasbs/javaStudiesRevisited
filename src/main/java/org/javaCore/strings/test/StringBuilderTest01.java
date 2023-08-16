package org.javaCore.strings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Vinícius Vilas Boas";
        name.concat(" Silva");
        name.substring(0,5);
        System.out.println(name);

        StringBuilder sb = new StringBuilder("StringBuilder");
        sb.append(" Test").append(" !!!");
//        sb.substring(0,3); // returns a STRING, not a STRINGBUILDER!
        sb.reverse();
        sb.reverse();
//        sb.delete(0, 2);
        System.out.println(sb);

        StringBuffer sbu = new StringBuffer("StringBuffer");
        sbu.append(" Test").append(" !!!");
//        sbu.substring(0,3); // returns a STRING, not a STRINGBUFFER!
        sbu.reverse();
        sbu.reverse();
//        sb.delete(0, 2);
        System.out.println(sbu);

    }
}
