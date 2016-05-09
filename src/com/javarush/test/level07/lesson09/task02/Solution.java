package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк.
Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++){
            arrayList.add(reader.readLine());
        }
        arrayList.remove(2);

        for (int i = arrayList.size()-1; i >= 0; i--){
            System.out.println(arrayList.get(i));
        }
    }
}
