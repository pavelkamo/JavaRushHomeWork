package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human kid1 = new Human("kid1", true, 10);
        Human kid2 = new Human("kid2", false, 11);
        Human kid3 = new Human("kid3", true, 13);

        Human father = new Human("father", true, 33, kid1, kid2, kid3);
        Human mother = new Human("mother", false, 32, kid1, kid2, kid3);

        Human gFather1 = new Human("gFather1", true, 66, father);
        Human gMother1 = new Human("gMother1", false, 65, father);

        Human gFather2 = new Human("gFather2", true, 63, mother);
        Human gMother2 = new Human("gMother2", false, 67, mother);

        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(gFather1.toString());
        System.out.println(gMother1.toString());
        System.out.println(gFather2.toString());
        System.out.println(gMother2.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human ... kids) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            for (int i = 0; i < kids.length; i++) {
                this.children.add(kids[i]);
            }
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
