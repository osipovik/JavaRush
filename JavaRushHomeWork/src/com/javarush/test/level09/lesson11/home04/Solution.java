package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String dateString = bufferedReader.readLine();

            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("MM/dd/yyyy");
            Date date = format.parse(dateString);

            SimpleDateFormat formatOut = new SimpleDateFormat("MMM dd, yyyy");

            System.out.println(formatOut.format(date).toUpperCase());
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
