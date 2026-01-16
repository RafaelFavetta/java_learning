package br.com.rafaelfavetta.exercicios3.inheritance.domain;

public class Archer extends Character {

    public Archer(int level, String name) {
        super(level, name);
    }

    @Override
    public double calculateDamage() {
        return level * 1.20;
    }
}
