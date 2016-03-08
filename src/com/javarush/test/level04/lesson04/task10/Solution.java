package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[] array = new Integer[3];
        array[0] = Integer.parseInt(reader.readLine());
        array[1] = Integer.parseInt(reader.readLine());
        array[2] = Integer.parseInt(reader.readLine());
        boolean[] pointNumbers = new boolean[3];
        pointNumbers[0] = false;
        pointNumbers[1] = false;
        pointNumbers[2] = false;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (i == k) {
                    continue;
                } else if (array[i] == array[k]) {
                    pointNumbers[i] = true;
                }
            }
        }
        //Show ecual numbers
        for (int i = 0; i < array.length; i++){
            if (pointNumbers[i] == true){
                System.out.print(array[i]);
            }
        }
    }
}