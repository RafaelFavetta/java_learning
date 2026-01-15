package br.com.rafaelfavetta.exercicios2.encapsulation.domain;

public class ShotMeter {

    private double greenWindow;

    public ShotMeter(double greenWindow) {
        this.greenWindow = 0.2;
    }

    public void train() {
        this.greenWindow += 0.05;
        if (this.greenWindow > 1) {
            this.greenWindow = 1;
        }
    }

    public boolean isGreen(double timing) {
        return timing <= greenWindow;
    }
}
