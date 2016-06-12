package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution {
    public static HashSet<String> createSet() {
        HashSet<String> set = new HashSet<>();

        set.add("лайка");
        set.add("люся");
        set.add("лоб");
        set.add("лом");
        set.add("лор");
        set.add("локоть");
        set.add("лёд");
        set.add("лень");
        set.add("лес");
        set.add("лена");
        set.add("лепс");
        set.add("лера");
        set.add("лекция");
        set.add("лаос");
        set.add("лемма");
        set.add("лектор");
        set.add("лекарь");
        set.add("лихач");
        set.add("лихо");
        set.add("лиза");

        return set;
    }
}
