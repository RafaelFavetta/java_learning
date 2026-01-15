package br.com.rafaelfavetta.exercicios2.association.domain;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public double averagePoints() {
        double total = 0;

        for (Player p : players) {
            total += p.getPointsPerGame();
        }
        return total / players.size();
    }

    public Player bestPlayer() {
        Player best = players.get(0);

        for (Player p : players) {
            if (p.getOverall() > best.getOverall()) {
                best = p;
            }
        }
        return best;
    }

    public double sumPoints() {
        double total = 0;

        for (Player p : players) {
            total += p.getPointsPerGame();
        }
        return total;
    }

    public double averageOverall() {
        double total = 0;

        for (Player p : players){
            total += p.getOverall();
        }
        return total / players.size();
    }

}
