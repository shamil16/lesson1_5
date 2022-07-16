package com.company;

public class Hero {
    private int health;
    private int damage;
    private String blackHole;

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }

    public String getBlackHole() {
        return blackHole;
    }
    public Hero(int health,int damage,String blackHole){
       this.health = health;
       this.damage = health;
       this.blackHole = blackHole;
    }
}