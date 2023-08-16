package org.javaCore.dates.formatingTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        System.out.println("Formatação de datas: \n");
        String pattern01 = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf01 = new SimpleDateFormat(pattern01);
        System.out.println(sdf01.format(new Date()));

        String pattern02 = "'Franca' dd 'de' MMMM 'de' yyyy"; //'às' HH:mm:ss z
        SimpleDateFormat sdf02 = new SimpleDateFormat(pattern02);
        System.out.println(sdf02.format(new Date()));

        try {
//            turns the adapted patter to Date again
            System.out.println(sdf02.parse("Franca 22 de junho de 2023")); //as 18:22:52 BRT
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
