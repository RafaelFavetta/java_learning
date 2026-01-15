package br.com.rafaelfavetta.exercicios2.interfaces.test;

import br.com.rafaelfavetta.exercicios2.interfaces.domain.Player;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClutchTest {
    public static void main(String[] args) {

        Player klayThompson = new Player("Klay Thompson", 35, 91);
        Player jordanPoole = new Player("Jordan Poole", 25, 84);
        Player draymondGreen = new Player("Draymond Green", 35, 84);
        Player victorWembanyama = new Player("Victor Wembanyama", 22, 90);

        List<Player> players = new ArrayList<>();

        players.add(klayThompson);
        players.add(jordanPoole);
        players.add(draymondGreen);
        players.add(victorWembanyama);

        players.stream()
                .filter(player -> player.isClutch(60))
                .forEach(player ->
                        System.out.println(player.getName())
                );
        }
}