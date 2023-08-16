package org.javaCore.wrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10.0;
        char charP = 'V';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // boxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10.0;
        Character charW = 'V';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean truly = Boolean.parseBoolean("true");
        System.out.println(truly);

        Character.isDigit('A');
        Character.isDigit('9');
        Character.isLetterOrDigit('!');
        Character.isUpperCase('a');
        Character.isLowerCase('A');
        Character.toUpperCase('a');
        Character.toLowerCase('A');

    }
}
