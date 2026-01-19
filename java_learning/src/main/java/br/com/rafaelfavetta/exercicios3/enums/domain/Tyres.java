package br.com.rafaelfavetta.exercicios3.enums.domain;

public enum Tyres {

    SOFT(0.8, 12),
    MEDIUM(0.7, 14),
    HARD(0.5, 15);

    final double wearSpeed;
    final double lackOfCompetetitiveness;

    public double getWearSpeed() {
        return wearSpeed;
    }

    public double getLackOfCompetetitiveness() {
        return lackOfCompetetitiveness;
    }

    Tyres(double wearSpeed, double lackOfCompetetitiveness) {
        this.wearSpeed = wearSpeed;
        this.lackOfCompetetitiveness = lackOfCompetetitiveness;
    }

    public boolean isStillCompetitive(int laps){
        return (laps * wearSpeed) < lackOfCompetetitiveness;
    }
}
