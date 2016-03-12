package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name;
    int weight;
    int age;
    String color;
    String address;
    public void initialize(String name){
        this.name = name;
    }//напишите тут ваш код
    public void initialize(String name, int weight){
        this.name = name;
        if (weight <= 0){
            this.weight = weight;
        } else {
            this.weight = 10;
        }
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        if (weight <= 0){
            this.weight = weight;
        } else {
            this.weight = 10;
        }
        if (age <= 0){
            this.age = age;
        } else {
            this.age = 10;
        }
    }
    public void initialize(int weight, String color){
        if (weight <= 0){
            this.weight = weight;
        } else {
            this.weight = 10;
        }
        this.color = color;
    }
    public void initialize(int weight, String color, String address){
        if (weight <= 0){
            this.weight = weight;
        } else {
            this.weight = 10;
        }
        this.color = color;
        this.address = address;
    }
}
