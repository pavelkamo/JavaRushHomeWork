package com.javarush.test.level14.lesson08.home09;

/**
 * Created by pkaminskyi on 20.09.16.
 */
public class USD extends Money {

    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
