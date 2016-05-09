package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = createMap();
        for (Map.Entry<String, String> map : stringHashMap.entrySet()){
            System.out.println(map.getKey() + " - " + map.getValue());
        }
        System.out.println("========");
        removeTheFirstNameDuplicates(stringHashMap);
        System.out.println("========");
        for (Map.Entry<String, String> map : stringHashMap.entrySet()){
            System.out.println(map.getKey() + " - " + map.getValue());
        }
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("lastName0", "name0");
        hashMap.put("lastName1", "name");
        hashMap.put("lastName2", "name2");
        hashMap.put("lastName3", "name3");
        hashMap.put("lastName4", "name");
        hashMap.put("lastName5", "name5");
        hashMap.put("lastName6", "name6");
        hashMap.put("lastName7", "name");
        hashMap.put("lastName8", "name8");
        hashMap.put("lastName9", "name9");

        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> newMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();
        for (Map.Entry<String, String> s : map.entrySet()){
            if (!hashSet.contains(s.getValue())) {
                hashSet.add(s.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
