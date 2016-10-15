package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.DoubleSummaryStatistics;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String URL = reader.readLine();
            parseURL(URL);
        } catch (Exception e){

        }
    }

    public static void parseURL(String URL){
        int start = URL.indexOf("?") + 1;
        String params = URL.substring(start);
        String [] strs = params.split("&");
        String s = null;
        for (int i = 0; i < strs.length; i++){
            if (strs[i].contains("=")) {
                String paramName = strs[i].substring(0, strs[i].indexOf("="));
                if ("obj".equals(paramName)){
                    s = strs[i].substring(strs[i].indexOf("=") + 1);
                }
                System.out.print(paramName + " ");
            } else {
                System.out.print(strs[i] + " ");
            }
        }
        if (s != null){
            System.out.println();
            try{
                double d = Double.parseDouble(s);
                alert(d);
            } catch (Exception e){
                alert(s);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
