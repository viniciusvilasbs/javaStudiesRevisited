package org.javaCore.collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConvertionTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Integer[] listToArray = numbers.toArray(new Integer[0]);

        System.out.println("List to Array: " + Arrays.toString(listToArray));
        System.out.println("******************************");

        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numbersArray);
        arrayToList.set(0,12);
//        arrayToList.add(19); // não é possível alterar o array desse modo, o asList é imutável e gera exception
//                                para alterar um array transformado em lista, use o modo "numbersList" abaixo
        System.out.println("Numbers array: " + Arrays.toString(numbersArray));
        System.out.println("Array to list: " + arrayToList);

        System.out.println("******************************");

        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray));
        numbersList.add(25);
        System.out.println("Numbers List: " + numbersList);

    }
}
