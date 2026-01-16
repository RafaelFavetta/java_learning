package br.com.rafaelfavetta.exercicios3.inheritance.domain;

public class Mage extends Character {


    public Mage(int level, String name) {
        super(level, name);
    }

    @Override
    public void attack() {
        System.out.println("Magic spell thrown!!!");
    }

    @Override
    public double calculateDamage() {
        return level * 1.25;
    }
}
