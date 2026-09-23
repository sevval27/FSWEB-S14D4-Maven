package org.example.rpg;

public class Werewolf extends Monster implements Bleedable, Poisonable {
    private String name;
    private int hitPoints;
    private double damage;

    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.2;
    }
    @Override 
    public double poison() {
        return getDamage() * 0.15;
    }
    @Override 
    public double attack() {
        return getDamage() + bleed() + poison();
    }

}
