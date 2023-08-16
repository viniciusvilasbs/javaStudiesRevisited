package org.javaCore.methods.test;

import org.javaCore.methods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator01 = new Calculator();

        calculator01.sumTwoNumbers();
        calculator01.subtractTwoNumbers();
        calculator01.multiplyTwNumbers(10, 20);
        calculator01.divideTwoNumbers(20, 2);
        calculator01.printTwoNumbersDivision(30, 5);
        calculator01.sumVarArgs(1,2,3,4,5,6,7,8);
    }
}
