package br.com.rafaelfavetta.exercicios3.casting.domain;

public class Actor extends Celebrity {

    public Actor(int yearsOfCareer) {
        super(yearsOfCareer);
    }

    @Override
    public void perform() {
        System.out.println("Acting...");
    }
}
