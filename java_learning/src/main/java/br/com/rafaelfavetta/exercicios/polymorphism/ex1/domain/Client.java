package br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain;

import br.com.rafaelfavetta.exercicios.polymorphism.ex1.auth.Authenticable;

public class Client implements Authenticable {

    private String name;
    private int idade;
    private String password;

    public Client(String name, int idade, String password) {
        this.name = name;
        this.idade = idade;
        this.password = password;
    }

    @Override
    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}
