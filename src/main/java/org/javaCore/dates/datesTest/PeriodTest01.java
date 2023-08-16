package org.javaCore.dates.datesTest;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate dateAfterTwoYears = LocalDate.now().plusYears(2).plusDays(8);

        Period p1 = Period.between(date, dateAfterTwoYears);
        System.out.println();

        Period p2 = Period.ofDays(30);
        Period p3 = Period.ofWeeks(39); // it uses DAYS instead of WEEKS
        Period p4 = Period.ofMonths(580);
        Period p5 = Period.ofYears(201);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
