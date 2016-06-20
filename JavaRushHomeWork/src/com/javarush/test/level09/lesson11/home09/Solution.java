package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();

        map.put("barsik", new Cat("barsik"));
        map.put("mursik", new Cat("mursik"));
        map.put("pusik", new Cat("pusik"));
        map.put("murka", new Cat("murka"));
        map.put("durka", new Cat("durka"));
        map.put("nurka", new Cat("nurka"));
        map.put("glasha", new Cat("glasha"));
        map.put("pepel", new Cat("pepel"));
        map.put("dim", new Cat("dim"));
        map.put("kot", new Cat("kot"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();

        for (Entry cat : map.entrySet()) {
            cats.add((Cat)cat.getValue());
        }

        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
