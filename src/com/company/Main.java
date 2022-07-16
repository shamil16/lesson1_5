package com.company;

public class Main {

    public static void main(String[] args) {
        Boss toxicBoss = new Boss();
        toxicBoss.setHealth(300);
        toxicBoss.setDamage(100);
        toxicBoss.setChemicalProtection("Fair");
        System.out.println("Health Boss = " + toxicBoss.getHealth());
        System.out.println("Damage Boss = " + toxicBoss.getDamage());
        System.out.println("Defence boss from " + toxicBoss.getChemicalProtection());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + createHeroes()[i].getDamage() + createHeroes()[i].getBlackHole());
        }
    }

    public static Hero[] createHeroes() {
        Hero magic = new Hero(250, 50);
        Hero warrior = new Hero(220, 35);
        Hero defence = new Hero(210, 15, "arrow");
        Hero[] allHeroes = new Hero[]{magic, warrior, defence};
        return allHeroes;
        }
}