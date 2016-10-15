package com.javarush.test.level15.lesson12.home04;

/**
 * Created by pkaminskyi on 15.10.16.
 */
public class Sun implements Planet {
    private static Sun sun = null;
    private Sun(){

    }

    public static Sun getInstance() {
        if (sun == null){
            sun = new Sun();
        }
        return sun;
    }
}
