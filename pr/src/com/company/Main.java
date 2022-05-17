package com.company;

public class Main {

    public static void main(String[] args) {

        Mana mymana= new Mana(0.5,400,5);
        HP health = new HP(2.5,800,5);
        Person axe = new Person(5,5,1,0,"Axe");

        System.out.println("Ім`я героя : "+ axe.name+" , lvl: "+ axe.lvl+", статус : Сила -"+ axe.power+" , ловкість-"+ axe.dexterity);
        System.out.println("Мана: об'єм-"+ mymana.amount+" , регенерація-"+ mymana.regeneration +" , інтелект-"+ mymana.intelligence);
        System.out.println("Здоров'я : об'єм-"+ health.amount+" , регенерація-"+ health.regeneration +" , Витривалість-"+ health.endurance);
        System.out.println();

        axe.fight_lvl();
        System.out.println("Після бою втома піднялася до : "+ axe.fight_fatigue(0));
        System.out.println("Після бою втома2 піднялася до : "+ axe.fight_fatigue2());
        health.fight_endurance();
        mymana.fight_Intelligence();
        System.out.println("Регенерація Mana тепер : "+mymana.fight_amount_mana(0.5)+" , а HP : "+health.fight_amount_HP(2.5));
        System.out.println("Регенерація Mana2 тепер : "+mymana.fight_amount_mana2()+" , а HP2 : "+health.fight_amount_HP2());
        System.out.println();

        Person.boss_heks(500,10,8,4);
        Mana.boss_mana(900,10);
        HP.boss_HP(780,10);
        System.out.println();
        Person myperson1 = new Person(5,5,1,0,"Axe");
        Person myperson2 = new Person();
        Person mysum = new Person(5);
        System.out.println(myperson1.volume());
        System.out.println(myperson2.volume());
        System.out.println(mysum.volume());



    }
}