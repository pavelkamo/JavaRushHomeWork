package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        checkNumber(Integer.parseInt(reader.readLine()));
        //напишите тут ваш код

    }

    public static void checkNumber(int a){
        if (a >= 0){
            a *= 2;
        } else {
            a += 1;
        }
        System.out.println(a);
    }

}