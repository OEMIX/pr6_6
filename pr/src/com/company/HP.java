package com.company;

public class HP {
    double regeneration; // регенерація
    int amount; // об'єм
    int endurance; // Витривалість

    public HP (double regeneration, int amount, int endurance){
        this.regeneration = regeneration;
        this.amount=amount;
        this.endurance = endurance;
    }
    void fight_endurance(){
        endurance = endurance+4;
        System.out.println("Після бою, витривалість піднялася на : 4 "+"("+endurance+")");
    }
    double fight_amount_HP(double regeneration){
        double reg_HP = regeneration * 4;
        return reg_HP ;
    }
    int fight_amount_HP2() {
        int reg_HP2 = (int) (regeneration * 4);
        return reg_HP2;
    }
    static void boss_HP(int amount, int endurance){
        System.out.println("Мінімальні характеристики HP: amount- "+amount+", intelligence - "+endurance);
    }
}