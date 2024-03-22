package com.example.javafx.Labs.no4;

public class workingSpace
{
    public static void main(String[] args)
    {
        //test dzialania - kuba
        System.out.println(Dodawanie(5,3));
        System.out.println(Odejmowanie(5,3));
        System.out.println(Dzielenie(15,3));
    }

    public static int Dodawanie(int a, int b)
    {
        return a+b;
    }

    public static int Odejmowanie(int a, int b)
    {
        return a-b;
    }
    public static int Dzielenie(int a, int b)
    {
        return a/b;
    }

}
