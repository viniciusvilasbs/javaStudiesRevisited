package org.javaCore.dates.formatingTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Data sem formatar: " + now);
        System.out.println();

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBr);
        System.out.println("Data formatada para o Brasil: " +formatBr);
        System.out.println();
        LocalDate parseBr = LocalDate.parse("23/06/2023", formatterBr);
        System.out.println("Fazendo o PARSE da data formatada Brasil para LocalDate: " + parseBr);
        System.out.println();

        DateTimeFormatter formatterJp = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.JAPAN);
        String formatJp = LocalDate.now().format(formatterJp);
        System.out.println("Data formatada para o Japão: " + formatJp);
        System.out.println();
    }
}
