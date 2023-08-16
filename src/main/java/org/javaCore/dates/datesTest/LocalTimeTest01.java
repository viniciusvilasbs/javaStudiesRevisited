package org.javaCore.dates.datesTest;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        LocalTime exampleTime = LocalTime.of(23,12,22);

        System.out.println(timeNow);
        System.out.println(exampleTime);
        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getSecond());
        System.out.println();
        System.out.println(timeNow.get(ChronoField.HOUR_OF_DAY));
        System.out.println(timeNow.get(ChronoField.MINUTE_OF_DAY));
        System.out.println(timeNow.get(ChronoField.SECOND_OF_DAY));
        System.out.println();
        System.out.println(LocalTime.MIN); // to get reports from the beggining of the day
        System.out.println(LocalTime.MAX); // to get reports until the end of the day
    }
}
