package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap<String, Date> hashMap = createMap();
        removeAllSummerPeople(hashMap);
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("sdfsdf", new Date("MAY 1 1980"));
        map.put("Ssdfne", new Date("JULY 1 1980"));
        map.put("Stasdfsllone", new Date("DECEMBER 1 1980"));
        map.put("Stallewwrone", new Date("NOVEMBER 1 1980"));
        map.put("Stal24lone", new Date("JUNE 1 1980"));
        map.put("Stalhtrlone", new Date("JUNE 1 1980"));
        map.put("Stallykuuone", new Date("JUNE 1 1980"));
        map.put("Stallo76ne", new Date("JUNE 1 1980"));
        map.put("Stallon67854e", new Date("JUNE 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Set<String> stringSet = new HashSet<>();
        for (Map.Entry<String, Date> pair : map.entrySet()){
            if (pair.getValue().getMonth() + 1 >= 6 && pair.getValue().getMonth() + 1 <= 8){
                stringSet.add(pair.getKey());
            }
        }
        for (String s : stringSet){
            map.remove(s);
        }
    }
}
