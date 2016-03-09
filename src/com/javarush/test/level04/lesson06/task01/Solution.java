package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[2];
        array[0] = Integer.parseInt(reader.readLine());
        array[1] = Integer.parseInt(reader.readLine());

        if (array[0] < array[1]){
            System.out.println(array[0]);
        } else {
            System.out.println(array[1]);
        }
    }
}