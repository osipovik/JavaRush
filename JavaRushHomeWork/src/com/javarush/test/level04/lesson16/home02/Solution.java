package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int arr[] = {a,b,c};

        int middle = b;

        if (b > Math.max(a,c)) {
            middle = Math.max(a,c);
        } else if (b < Math.min(a,c)) {
            middle = Math.min(a,c);
        }

        System.out.println(middle);
    }
}
