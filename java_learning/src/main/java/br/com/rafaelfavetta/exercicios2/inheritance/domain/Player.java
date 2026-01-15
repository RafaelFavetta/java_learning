package br.com.rafaelfavetta.exercicios2.inheritance.domain;

public abstract class Player {

    protected String name;
    protected double ovr;

    public Player(String name, double ovr) {
        this.name = name;
        this.ovr = ovr;
    }

    public abstract double calculateImpact();

    public String getName() {
        return name;
    }

    public double getOvr() {
        return ovr;
    }
}
