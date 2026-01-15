package br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain;

import br.com.rafaelfavetta.exercicios.polymorphism.ex1.auth.Authenticable;
import br.com.rafaelfavetta.exercicios.polymorphism.ex1.auth.Role;

public abstract class Staff implements Authenticable {

    private String name;
    protected double salary;
    protected Role role;
    protected String password;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Staff(String name, double salary, Role role, String password) {
        this.name = name;
        this.salary = salary;
        this.role = role;
        this.password = password;
    }

    public abstract double calculateBonus();

    public double calculateTotalSalary() {
        return salary + calculateBonus();
    }

    public abstract boolean canApproveBudget();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean authenticate(String password) {
        if (!role.canAuthenticate()) return false;
        if (this.password == null) return false;

        return this.password.equals(password) && password.length() > 4;
    }
}
