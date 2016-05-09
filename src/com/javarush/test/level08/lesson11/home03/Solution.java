package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("f1", "n1");
        stringMap.put("f2", "n2");
        stringMap.put("f2", "n2");
        stringMap.put("f4", "n4");
        stringMap.put("f5", "n5");
        stringMap.put("f6", "n6");
        stringMap.put("f7", "n7");
        stringMap.put("f8", "n8");
        stringMap.put("f9", "n9");
        stringMap.put("f10", "n10");

        return stringMap;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
