package br.com.rafaelfavetta.exercicios.polymorphism.ex1.auth;

public enum Role {

    MANAGER(true),
    DEVELOPER(false),
    CLIENT(false);

    private final boolean canAuthenticate;

    Role(boolean canAuthenticate) {
        this.canAuthenticate = canAuthenticate;
    }

    public boolean canAuthenticate() {
        return canAuthenticate;
    }
}
