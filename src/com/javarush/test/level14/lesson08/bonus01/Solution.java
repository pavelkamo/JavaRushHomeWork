package com.javarush.test.level14.lesson08.bonus01;

import java.awt.image.RasterFormatException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.*;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        exceptions.add(new ConcurrentModificationException());
        exceptions.add(new ClassCastException());
        exceptions.add(new RuntimeException());
        exceptions.add(new IOException());
        exceptions.add(new RasterFormatException(""));
        exceptions.add(new EmptyStackException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
    }
}
