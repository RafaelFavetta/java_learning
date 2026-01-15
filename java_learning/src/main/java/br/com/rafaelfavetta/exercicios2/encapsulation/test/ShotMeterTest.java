package br.com.rafaelfavetta.exercicios2.encapsulation.test;

import br.com.rafaelfavetta.exercicios2.encapsulation.domain.ShotMeter;

public class ShotMeterTest {
    public static void main(String[] args) {

        ShotMeter shotMeter = new ShotMeter(0.01);

        shotMeter.train();
        shotMeter.train();
        shotMeter.train();
        shotMeter.train();
        shotMeter.train();

        System.out.println(shotMeter.isGreen(0.50));
    }
}
