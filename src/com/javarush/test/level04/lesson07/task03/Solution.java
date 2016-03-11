package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array [] = new int[3];
        int positive = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());//напишите тут ваш код
            if (array[i] > 0){
                positive++;
            }
        }
        System.out.println(positive);//напишите тут ваш код

    }
}
