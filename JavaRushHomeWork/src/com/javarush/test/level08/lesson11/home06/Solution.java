package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();

        Human son = new Human();
        son.name = "son";
        son.age = 20;
        son.sex = true;
        son.children = new ArrayList<>();
        children.add(son);

        Human son2 = new Human();
        son2.name = "son2";
        son2.age = 15;
        son2.sex = true;
        son2.children = new ArrayList<>();
        children.add(son2);

        Human dauther = new Human();
        dauther.name = "son";
        dauther.age = 17;
        dauther.sex = false;
        dauther.children = new ArrayList<>();
        children.add(dauther);

        ArrayList<Human> fatherSon = new ArrayList<>();

        Human father = new Human();
        father.name = "папа";
        father.age = 41;
        father.sex = true;
        father.children = children;
        fatherSon.add(father);

        ArrayList<Human> motherChild = new ArrayList<>();

        Human mother = new Human();
        mother.name = "мама";
        mother.age = 43;
        mother.sex = false;
        mother.children = children;
        motherChild.add(mother);

        Human grFather1 = new Human();
        grFather1.name = "дед1";
        grFather1.age = 81;
        grFather1.sex = true;
        grFather1.children = fatherSon;


        Human grFather2 = new Human();
        grFather2.name = "дед2";
        grFather2.age = 83;
        grFather2.sex = true;
        grFather2.children = motherChild;

        Human grMother1 = new Human();
        grMother1.name = "Бабушка1";
        grMother1.age = 80;
        grMother1.sex = false;
        grMother1.children = fatherSon;

        Human grMother2 = new Human();
        grMother2.name = "Бабушка2";
        grMother2.age = 82;
        grMother2.sex = false;
        grMother2.children = motherChild;

        System.out.println(grFather1);
        System.out.println(grFather2);
        System.out.println(grMother1);
        System.out.println(grMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(son2);
        System.out.println(dauther);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
