package br.com.rafaelfavetta.exercicios3.casting.domain;

public class Actor extends Celebrity {

    public Actor(int yearsOfCareer) {
        super(yearsOfCareer);
    }

    public void act() {
        System.out.println("Acting...");
    }
}
