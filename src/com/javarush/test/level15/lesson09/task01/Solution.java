package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {

        System.out.println(labels);
    }

    static {
        labels.put(0.1, "q1");
        labels.put(0.2, "q2");
        labels.put(0.3, "q3");
        labels.put(0.4, "q4");
        labels.put(0.5, "q5");
    }
}
