package org.javaCore.dates.datesTest;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate now2 = LocalDate.now();
        LocalDate now3 = LocalDate.now();

        System.out.println("Data hoje: " + now);

        now = now.withDayOfMonth(25);
        System.out.println("Data com dia 25 do mês: " + now);

        now2 = now2.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println("Dia do mês 20 (com ChronoField): " + now2);

//        now3 = now3.with(TemporalAdjusters.firstDayOfMonth());
//        System.out.println("Temporal Adjuster com primeiro dia do mês: " + now3);
//
//        now3 = now3.with(TemporalAdjusters.lastDayOfMonth());
//        System.out.println("Temporal Adjuster com último dia do mês: " + now3);

//        now3 = now3.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
//        System.out.println("Temporal Adjuster com data da próxima quarta-feira: " + now3);

        now3 = now3.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        System.out.println("Temporal Adjuster com data do último sábado: " + now3);
    }
}
