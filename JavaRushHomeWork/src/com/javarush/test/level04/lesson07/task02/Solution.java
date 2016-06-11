package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        if (number < 1 || number > 999) {
            return;
        }

        if (number % 2 == 0) {
            System.out.print("четное");
        } else {
            System.out.print("нечетное");
        }

        int digitsCount = String.valueOf(number).length();

        switch (digitsCount) {
            case 1:
                System.out.print(" однозначное");
                break;
            case 2:
                System.out.print(" двузначное");
                break;
            case 3:
                System.out.print(" трехзначное");
                break;
        }

        System.out.print(" число");
    }
}
