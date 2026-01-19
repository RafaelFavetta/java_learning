package br.com.rafaelfavetta.exercicios3.casting.domain;

public class Singer extends Celebrity {

    public Singer(int yearsOfCareer) {
        super(yearsOfCareer);
    }

    public void sing() {
        System.out.println("Singing...");
    }
}
