package br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain;

import br.com.rafaelfavetta.exercicios.polymorphism.ex1.auth.Authenticable;
import br.com.rafaelfavetta.exercicios.polymorphism.ex1.auth.Role;

public class Client implements Authenticable {

    private Role role;
    private String name;
    private int idade;
    private String password;

    public Client(String name, int idade, String password) {
        this.name = name;
        this.idade = idade;
        this.password = password;
        this.role = Role.CLIENT;
    }

    @Override
    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}
