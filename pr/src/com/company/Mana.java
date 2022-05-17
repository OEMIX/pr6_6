package com.company;

public class Mana {
    double regeneration; // регенерація
    double amount; // об'єм
    int intelligence; // Інтелект

    public Mana (double regeneration, double amount, int intelligence){
        this.regeneration = regeneration;
        this.amount=amount;
        this.intelligence = intelligence;
    }
    void fight_Intelligence(){
        intelligence = intelligence+2;
        System.out.println("Також, після бою інтелект піднялася на : 2 "+"("+intelligence+")");
    }
    double fight_amount_mana(double regeneration){
        double reg_mana = regeneration*2;
        return reg_mana ;
    }
    int fight_amount_mana2(){
        int reg_mana2 = (int) (regeneration*2);
        return reg_mana2 ;
    }
    static void boss_mana(int amount, int intelligence){
        System.out.println("Мінімальні характеристики Mana: amount- "+amount+", intelligence - "+intelligence);
    }
}