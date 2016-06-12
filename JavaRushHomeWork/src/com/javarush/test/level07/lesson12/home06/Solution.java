package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {
    public static void main(String[] args) {
        Human grFather1 = new Human();
        grFather1.name = "дед1";
        grFather1.age = 81;
        grFather1.sex = true;

        Human grFather2 = new Human();
        grFather2.name = "дед2";
        grFather2.age = 83;
        grFather2.sex = true;

        Human grMother1 = new Human();
        grMother1.name = "Бабушка1";
        grMother1.age = 80;
        grMother1.sex = false;

        Human grMother2 = new Human();
        grMother2.name = "Бабушка2";
        grMother2.age = 82;
        grMother2.sex = false;

        Human father = new Human();
        father.name = "папа";
        father.age = 41;
        father.sex = true;
        father.father = grFather1;
        father.mother = grMother1;

        Human mother = new Human();
        mother.name = "мама";
        mother.age = 43;
        mother.sex = false;
        mother.father = grFather2;
        mother.mother = grMother2;

        Human son = new Human();
        son.name = "son";
        son.age = 20;
        son.sex = true;
        son.father = father;
        son.mother = mother;

        Human son2 = new Human();
        son2.name = "son2";
        son2.age = 15;
        son2.sex = true;
        son2.father = father;
        son2.mother = mother;

        Human dauther = new Human();
        dauther.name = "son";
        dauther.age = 17;
        dauther.sex = false;
        dauther.father = father;
        dauther.mother = mother;

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
        Human father, mother;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
