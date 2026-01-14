package br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain;

public class Manager extends Staff {

    private String password;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Manager(String name, double salary, String password) {
        super(name, salary);
        this.password = password;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.5;
    }

    @Override
    public boolean authenticate(String password) {
        return this.password.equals(password) && password.length() > 4;
    }
}
