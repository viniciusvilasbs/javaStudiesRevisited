package org.javaCore.dates.datesTest;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        System.out.println();

        LocalDate dateToday = LocalDate.now();
        LocalDate exampleDate = LocalDate.of(1987, Month.FEBRUARY, 02);

        System.out.println("Data hoje: " + dateToday);
        System.out.println("Data de exemplo: " + exampleDate);
        System.out.println("Ano atual: " + dateToday.getYear());
        System.out.println("Mês atual: " +dateToday.getMonth());
        System.out.println("Mês número: " + dateToday.getMonthValue());
        System.out.println("Dia da semana atual: " + dateToday.getDayOfWeek());
        System.out.println("Dia do mês atual: " + dateToday.getDayOfMonth());
        System.out.println("Dias no mês atual: " + dateToday.lengthOfMonth());
        System.out.println("Ano bissexto atual: " + dateToday.isLeapYear());
        System.out.println("Era atual: " + dateToday.get(ChronoField.ERA));
    }
}
