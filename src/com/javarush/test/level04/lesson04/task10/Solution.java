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
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
//        System.out.println(number1 + " " + number2 + " " + number3);
        if (number1 == number2 && number1 != number3){
            System.out.print(number1 + " " + number2);
        } else if (number1 == number3 && number1 != number2){
            System.out.print(number1 + " " + number3);
        } else if (number2 == number3 && number1 != number3){
            System.out.print(number2 + " " + number3);
        } else if (number1 == number2 && number1 == number3){
            System.out.print(number1 + " " + number2 + " " + number3);
        }
     }
}