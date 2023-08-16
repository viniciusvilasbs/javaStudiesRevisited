package org.javaCore.designPatterns.test;

import org.javaCore.designPatterns.domain.factory.CountryFactory;
import org.javaCore.designPatterns.domain.factory.CurrencyFactory;
import org.javaCore.designPatterns.domain.factory.CurrencyFactoryInterface;

public class CurrencyTest01 {
    public static void main(String[] args) {
        CurrencyFactoryInterface currencyFactory01 = CurrencyFactory.newCurrency(CountryFactory.BRAZIL);
        CurrencyFactoryInterface currencyFactory02 = CurrencyFactory.newCurrency(CountryFactory.USA);

        System.out.println(currencyFactory01.getSymbol());
        System.out.println(currencyFactory02.getSymbol());
    }
}
