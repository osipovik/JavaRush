package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();

        zerg1.name = "asd";
        zerg2.name = "asdq";
        zerg3.name = "qwe3";
        zerg4.name = "fsda";
        zerg5.name = "desw";
        zerg6.name = "wser";
        zerg7.name = "vfrd";
        zerg8.name = "ewsd";
        zerg9.name = "asdw";
        zerg10.name = "asws";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();

        terran1.name = "tre";
        terran2.name = "tgfe";
        terran3.name = "bgfc";
        terran4.name = "sdftr";
        terran5.name = "nbgd";
        terran6.name = "qwrfx";
        terran7.name = "qwrfvxc";
        terran8.name = "hgdfde";
        terran9.name = "qwdcx";
        terran10.name = "zvrc";
        terran11.name = "qwedcx";
        terran12.name = "bvxd";

        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();

        protos1.name = "bdrfv";
        protos2.name = "rxdee";
        protos3.name = "bfvdcd";
        protos4.name = "dtgcx";
        protos5.name = "gbdrcdz";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}