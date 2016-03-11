package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double currentTime = Double.parseDouble(reader.readLine());
        int green = 3;
        int yellow = 1, red = 1;
        int timePeriod = green + yellow + red;
        if (currentTime >= timePeriod){
            currentTime = currentTime % timePeriod;
            colorOfLight(currentTime, green, yellow, red);
        } else {
            colorOfLight(currentTime, green, yellow, red);
        }
    }

    public static void colorOfLight(double currentTime, int green, int yellow, int red){
        int period = green + yellow + red;
        if(currentTime < period){
            if(currentTime >= 0 && currentTime < green){
                System.out.println("зеленый");//напишите тут ваш код
            } else if (currentTime >= green && currentTime < green + yellow){
                System.out.println("желтый");
            } else if (currentTime >= green + yellow && currentTime < period) {
                System.out.println("красный");
            }
        }
    }
}