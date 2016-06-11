package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int positiveCount = 0,
            negativeCount = 0;

        if (a > 0) {
            positiveCount++;
        } else {
            negativeCount++;
        }

        if (b > 0) {
            positiveCount++;
        } else {
            negativeCount++;
        }

        if (c > 0) {
            positiveCount++;
        } else {
            negativeCount++;
        }

        System.out.println("количество отрицательных чисел: " + negativeCount);
        System.out.println("количество положительных чисел: " + positiveCount);
    }
}
