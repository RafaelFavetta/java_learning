package br.com.rafaelfavetta.exercicios3.encapsulation.domain;

public class User {

    private final String email;
    private final String name;

    public User(String email, String name) {

        if (!email.contains("@") || email.startsWith("@") || email.endsWith("@") || !email.contains(".")){
            throw new IllegalArgumentException("Email inválido");
        }

        this.email = email;
        this.name = name;
    }



    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
