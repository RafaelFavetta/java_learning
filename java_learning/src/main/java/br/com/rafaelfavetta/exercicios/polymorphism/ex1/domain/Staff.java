package br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain;

import br.com.rafaelfavetta.exercicios.polymorphism.ex1.auth.Authenticable;

public abstract class Staff implements Authenticable {

    private String name;
    protected double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public double calculateTotalSalary() {
        return salary + calculateBonus();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
