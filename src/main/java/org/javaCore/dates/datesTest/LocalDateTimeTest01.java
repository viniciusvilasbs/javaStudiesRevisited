package org.javaCore.dates.datesTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime01 = LocalDateTime.now();
//        LocalDate date = LocalDate.now();
        LocalDate date = LocalDate.parse("2025-02-02");
//        LocalTime time = LocalTime.now();
        LocalTime time = LocalTime.parse("20:50:24");

        System.out.println(localDateTime01);
        System.out.println(date);
        System.out.println(time);
        System.out.println();

        LocalDateTime ldt01 = date.atTime(time);
        LocalDateTime ldt02 = time.atDate(date);
        System.out.println(ldt01);
        System.out.println(ldt02);
    }
}
