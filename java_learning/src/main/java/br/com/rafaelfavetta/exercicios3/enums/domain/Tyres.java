package br.com.rafaelfavetta.exercicios3.enums.domain;

public enum Tyres {

    SOFT(1, 14),
    MEDIUM(1, 20),
    HARD(1, 25);

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
