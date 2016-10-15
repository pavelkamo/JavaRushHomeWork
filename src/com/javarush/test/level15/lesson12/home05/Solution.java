package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    Solution()
    {
    }
    Solution(Byte b)
    {
    }
    Solution(float f)
    {
    }

    public Solution(Integer integer)
    {
    }
    public Solution(Double aDouble)
    {
    }
    public Solution(Character character)
    {
    }

    protected Solution(String s)
    {
    }
    protected Solution(short sh)
    {
    }
    protected Solution(double d)
    {
    }

    private Solution(int i)
    {
    }
    private Solution(Float by)
    {
    }
    private Solution(char ch)
    {
    }

}

