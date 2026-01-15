package br.com.rafaelfavetta.exercicios2.inheritance.domain;

public class Shooter extends Player {

    public Shooter(String name, double ovr) {

        super(name, ovr);
    }

    @Override
    public double calculateImpact() {
        return ovr * 1.30;
    }
}
