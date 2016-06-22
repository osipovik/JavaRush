package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        String name;
        int age;
        boolean sex;
        Human father;
        Human mother;
        Human[] childs;

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(Human father) {
            this.father = father;
        }

        public Human(Human father, Human mother) {
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(Human[] childs, String name) {
            this.childs = childs;
            this.name = name;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, Human father) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
        }

        public Human(String name, int age, boolean sex, Human father, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }
    }
}
