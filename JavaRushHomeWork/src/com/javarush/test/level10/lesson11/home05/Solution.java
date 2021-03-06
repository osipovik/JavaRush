package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();
        int[] charCount = new int[33];

        ArrayList<Character> alphabet = new ArrayList<Character>();

        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());

            for (int j = 0; j < s.length(); j++) {
                if (alphabet.contains(list.get(i).charAt(j))) {
                    charCount[abc.indexOf(list.get(i).charAt(j))]++;
                }
            }
        }

        for (int i = 0; i < abcArray.length; i++) {
            System.out.println(abcArray[i] + " " + charCount[i]);
        }
    }

}
