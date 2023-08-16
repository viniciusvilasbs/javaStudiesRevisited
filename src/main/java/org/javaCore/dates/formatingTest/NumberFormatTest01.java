package org.javaCore.dates.formatingTest;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {

        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeUSA = Locale.US;
        Locale localeCH = Locale.CHINA;

        NumberFormat[] nfa = new NumberFormat[5];

        nfa[0] = NumberFormat.getInstance(localeUSA);
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeCH);
        nfa[3] = NumberFormat.getInstance(localeBR);
        nfa[4] = NumberFormat.getInstance(localeIT);

        double value = 10000000.2130;

        System.out.println("Formatação de NÚMEROS em diferentes países: ");

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(value));
        }
        System.out.println();

        System.out.println("Aplicando o PARSE de uma String em NÚMERO: ");
        String valueString = "10,000.21";
        try {
            System.out.println(nfa[0].parse(valueString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        nfa[0] = NumberFormat.getCurrencyInstance(localeUSA);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeCH);
        nfa[3] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[4] = NumberFormat.getCurrencyInstance(localeIT);

        value = 10000000.2130;

        System.out.println("Formatação de MOEDAS em diferentes países: ");

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(value));
        }

        System.out.println();

        System.out.println("Aplicando o PARSE de uma String em MOEDA: ");
        valueString = "$10,000.21"; //need to use the string as the currency, or throws exception
        try {
            System.out.println(nfa[0].parse(valueString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }
}
