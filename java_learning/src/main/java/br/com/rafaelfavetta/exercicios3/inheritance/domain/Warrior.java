package br.com.rafaelfavetta.exercicios3.inheritance.domain;

public class Warrior extends Character {

    public Warrior(int level, String name) {
        super(level, name);
    }

    @Override
    public void attack() {
        System.out.println("Sword fighting!!!");
    }

    @Override
    public double calculateDamage() {
        return level * 1.30;
    }
}
