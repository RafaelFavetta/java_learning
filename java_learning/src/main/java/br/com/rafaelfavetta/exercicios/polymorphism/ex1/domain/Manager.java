package br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain;

public class Manager extends Staff {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.5;
    }
}
