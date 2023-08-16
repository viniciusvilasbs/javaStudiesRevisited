package org.javaCore.designPatterns.domain.factory;

public class CurrencyFactory {
    public static CurrencyFactoryInterface newCurrency(CountryFactory country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default: throw new IllegalArgumentException("No currency found for this country!");
        }
    }
}
