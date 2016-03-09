package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[4];
        array[0] = Integer.parseInt(reader.readLine());
        array[1] = Integer.parseInt(reader.readLine());
        array[2] = Integer.parseInt(reader.readLine());
        array[3] = Integer.parseInt(reader.readLine());
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
