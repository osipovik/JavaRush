package com.javarush.test.level03.lesson03.task01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* Реализация метода
Добавьте метод public static void printString(String s) который будет выводить переданную строку на экран.
*/
public class Solution
{
    //напишите тут ваш код

    public static void main(String[] args) {
        printString("Hello Amigo!");
    }

    public static void printString(String s) {
        System.out.println(s);
    }
}
