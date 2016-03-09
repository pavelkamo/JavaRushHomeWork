package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[3];
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());//напишите тут ваш код
        }
        Arrays.sort(array);
        for (int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
