package org.javaCore.dates.formatingTest;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwitzerland = new Locale("en", "SW");
        Locale localeFrance = new Locale("fr", "FR");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeUsa = new Locale("en", "us");
        Locale localeBrazil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeUsa);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);

        System.out.println("Datas em diferentes países: ");
        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("França: " + df3.format(calendar.getTime()));
        System.out.println("Japão: " + df4.format(calendar.getTime()));
        System.out.println("EUA: " + df5.format(calendar.getTime()));
        System.out.println("Brasil: " + df6.format(calendar.getTime()));

        System.out.println(Locale.getDefault());
    }
}
