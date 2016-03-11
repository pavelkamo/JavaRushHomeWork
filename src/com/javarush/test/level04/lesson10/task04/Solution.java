package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 1;
        int j = 1;
        while (i <= 10){
            while (true){
                System.out.print("S");
                //напишите тут ваш код
                if (j < 10){
                    j++;
                } else if (j >= 10){
                    break;
                }
            }
            System.out.println();
            if (i < 10){
                i++;
                j = 1;
            } else if (i >= 10){
                break;
            }
        }//напишите тут ваш код

    }
}
