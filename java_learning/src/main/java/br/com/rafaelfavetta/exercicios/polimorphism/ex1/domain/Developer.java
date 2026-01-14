package br.com.rafaelfavetta.exercicios.polimorphism.ex1.domain;

public class Developer extends Staff{

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }
}
