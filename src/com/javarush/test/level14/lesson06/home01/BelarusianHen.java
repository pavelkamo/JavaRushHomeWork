package com.javarush.test.level14.lesson06.home01;

/**
 * Created by pkaminskyi on 20.09.16.
 */
public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        //<getDescription() родительского класса>  + <" Моя страна - Sssss. Я несу N яиц в месяц.">
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
