package br.com.rafaelfavetta.exercicios2.association.domain;

public class Player {

    private String name;
    private int overall;
    private double pointsPerGame;

    public Player(String name, int overall, double pointsPerGame) {
        this.name = name;
        this.overall = overall;
        this.pointsPerGame = pointsPerGame;
    }

    public double getPointsPerGame() {
        return pointsPerGame;
    }

    public String getName() {
        return name;
    }

    public int getOverall() {
        return overall;
    }
}
