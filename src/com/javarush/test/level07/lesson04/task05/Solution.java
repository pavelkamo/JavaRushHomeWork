package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];
        for (int i = 0; i < 20; i++){
            bigArray[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 10; i++){
            smallArray1[i] = bigArray[i];
            smallArray1[i] = bigArray[i + 10];
        }

        for (int i = 0; i < 10; i++){
            smallArray1[i] = bigArray[i];
            smallArray2[i] = bigArray[i + 10];
        }

        for (int i = 0; i < 10; i++){
            System.out.println(smallArray2[i]);
        }
    }
}
