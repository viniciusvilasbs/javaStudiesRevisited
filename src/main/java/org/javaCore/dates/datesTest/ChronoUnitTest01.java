package org.javaCore.dates.datesTest;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {

        LocalDateTime birthday = LocalDateTime.of(1987, Month.FEBRUARY, 02, 12,20,45);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Dias: " + ChronoUnit.DAYS.between(birthday, now));
        System.out.println("Semanas: " + ChronoUnit.WEEKS.between(birthday, now));
        System.out.println("Meses: " + ChronoUnit.MONTHS.between(birthday, now));
        System.out.println("Anos: " + ChronoUnit.YEARS.between(birthday, now));
    }
}
