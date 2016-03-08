package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        checkWeekDay(Integer.parseInt(reader.readLine()));//напишите тут ваш код
    }

    public static void checkWeekDay(int a){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "понедельник");
        map.put(2, "вторник");
        map.put(3, "среда");
        map.put(4, "четверг");
        map.put(5, "пятница");
        map.put(6, "суббота");
        map.put(7, "воскресенье");
        if (a <= 0 || a >= 8){
            System.out.println("такого дня недели не существует");
        } else {
            System.out.println(map.get(a));
        }
    }

}