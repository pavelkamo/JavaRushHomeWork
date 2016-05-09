package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = createMap();
        System.out.println(getCountTheSameFirstName(stringHashMap, "dfah"));
        System.out.println(getCountTheSameLastName(stringHashMap, "dhad"));
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("sdf", "dfgsdf");
        hashMap.put("sdfsd", "dsfsdf");
        hashMap.put("fg", "dfg4r");
        hashMap.put("3g", "4tg4");
        hashMap.put("dfgha", "dhad");
        hashMap.put("dfah", "dhad");
        hashMap.put("hdhre", "erher");
        hashMap.put("reherhe", "erherh");
        hashMap.put("erherh", "erherh");
        hashMap.put("erhererhh", "qrh3");
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        for (Map.Entry<String, String> stringEntry : map.entrySet()){
            if (stringEntry.getValue().equals(name)){
                i++;
            }
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int i = 0;
        for (Map.Entry<String, String> stringEntry : map.entrySet()){
            if (stringEntry.getKey().equals(lastName)){
                i++;
            }
        }
        return i;
    }
}
