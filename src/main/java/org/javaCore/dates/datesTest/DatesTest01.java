package org.javaCore.dates.datesTest;

import java.util.Date;

public class DatesTest01 {
    public static void main(String[] args) {
        Date date = new Date(); // Long 1687458371659L
        date.setTime(date.getTime() + 3600000); //adds 1 hour to the current hour
        System.out.println(date);
    }
}
