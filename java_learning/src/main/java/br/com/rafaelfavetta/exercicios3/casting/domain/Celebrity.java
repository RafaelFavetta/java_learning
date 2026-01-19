package br.com.rafaelfavetta.exercicios3.casting.domain;

public abstract class Celebrity {

    int yearsOfCareer;

    public Celebrity(int yearsOfCareer) {
        this.yearsOfCareer = yearsOfCareer;
    }

    public int getYearsOfCareer() {
        return yearsOfCareer;
    }
}
