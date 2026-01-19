package br.com.rafaelfavetta.exercicios3.enums.test;

import br.com.rafaelfavetta.exercicios3.enums.domain.Tyres;

public class TyresTest {
    public static void main(String[] args) {

        Tyres tyre = Tyres.SOFT;

        System.out.println(tyre.isStillCompetitive(14));
    }
}
