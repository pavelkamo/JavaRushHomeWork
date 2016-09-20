package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by pkaminskyi on 20.09.16.
 */
public class Singleton {

    private static Singleton singelton;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (singelton == null){
            singelton = new Singleton();
        }
        return singelton;
    }
}
