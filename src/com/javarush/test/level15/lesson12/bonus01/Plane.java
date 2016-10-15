package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by pkaminskyi on 15.10.16.
 */
public class Plane implements Flyable {
    @Override
    public void fly() {

    }
    private int passengers;
    public Plane(int passengers) {
        this.passengers = passengers;
    }
}
