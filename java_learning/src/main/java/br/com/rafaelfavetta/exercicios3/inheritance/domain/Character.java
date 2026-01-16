package br.com.rafaelfavetta.exercicios3.inheritance.domain;

public abstract class Character {

    protected int level;
    protected String name;

    public Character(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public abstract double calculateDamage();

    public abstract void attack();

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
