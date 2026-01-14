package br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain;

public class Developer extends Staff {

    private String password;

    public Developer(String name, double salary) {
        super(name, salary);
    }

    public Developer(String name, double salary, String password) {
        super(name, salary);
        this.password = password;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }

    @Override
    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}
