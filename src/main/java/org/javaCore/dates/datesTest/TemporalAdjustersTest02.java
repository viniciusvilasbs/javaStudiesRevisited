package org.javaCore.dates.datesTest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

public class TemporalAdjustersTest02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println("Data hoje: " + now);
        System.out.println("Dia da semana: " + now.getDayOfWeek());
        System.out.println();

        now = LocalDate.now().withDayOfMonth(7).with(new obtainNextBusinessDay());
        System.out.println("Próximo dia útil: " + now);
        System.out.println("Próximo dia da semana útil: " + now.getDayOfWeek());
        System.out.println("*************************************************");

        now = LocalDate.now().withDayOfMonth(9).with(new obtainNextBusinessDay());
        System.out.println("Próximo dia útil: " + now);
        System.out.println("Próximo dia da semana útil: " + now.getDayOfWeek());
        System.out.println("*************************************************");

        now = LocalDate.now().withDayOfMonth(10).with(new obtainNextBusinessDay());
        System.out.println("Próximo dia útil: " + now);
        System.out.println("Próximo dia da semana útil: " + now.getDayOfWeek());
        System.out.println("*************************************************");

        now = LocalDate.now().withDayOfMonth(11).with(new obtainNextBusinessDay());
        System.out.println("Próximo dia útil: " + now);
        System.out.println("Próximo dia da semana útil: " + now.getDayOfWeek());
        System.out.println("*************************************************");
    }
}
class obtainNextBusinessDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int addDays;

        switch (dayOfWeek) {
            case THURSDAY: addDays = 4;
                break;
            case FRIDAY: addDays = 3;
                break;
            case SATURDAY: addDays = 2;
                break;
            default: addDays = 1;
                break;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}
