package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String firstName;
        String lastName;
        String nickName;
        int age;
        boolean sex;
        String nationality;

        public Human(String firstName, String lastName, String nickName, int age, boolean sex, String nationality) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.nickName = nickName;
            this.age = age;
            this.sex = sex;
            this.nationality = nationality;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, String nickName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.nickName = nickName;
        }

        public Human(String firstName, String lastName, String nickName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.nickName = nickName;
            this.age = age;
        }

        public Human(String firstName, String lastName, String nickName, int age, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.nickName = nickName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, String nickName, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.nickName = nickName;
            this.sex = sex;
        }

        public Human(String firstName, String nickName, int age) {
            this.firstName = firstName;
            this.nickName = nickName;
            this.age = age;
        }

        public Human(String firstName, String nationality, boolean sex, int age) {
            this.firstName = firstName;
            this.nationality = nationality;
            this.sex = sex;
            this.age = age;
        }

        public Human(String firstName, int age, boolean sex) {
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }
    }
}
