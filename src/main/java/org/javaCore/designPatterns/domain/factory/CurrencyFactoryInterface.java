package org.javaCore.designPatterns.domain.factory;

public interface CurrencyFactoryInterface {
    String getSymbol();

}

class Real implements CurrencyFactoryInterface {
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDollar implements CurrencyFactoryInterface {
    @Override
    public String getSymbol() {
        return "US$";
    }
}
