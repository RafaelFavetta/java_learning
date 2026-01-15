package br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain;

import br.com.rafaelfavetta.exercicios.polymorphism.ex1.auth.Role;

public class Manager extends Staff {

    private String password;

    public Manager(String name, double salary, String password) {
        super(name, salary);
        this.password = password;
        this.role = Role.MANAGER;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.5;
    }

    @Override
    public boolean authenticate(String password) {
        return this.password.equals(password) && password.length() > 4;
    }

    public boolean approveBudget(){
        return getSalary() >= 5000;
    }

    @Override
    public boolean canApproveBudget() {
        return true;
    }
}
