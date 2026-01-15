package br.com.rafaelfavetta.exercicios2.association.test;


import br.com.rafaelfavetta.exercicios2.association.domain.Player;
import br.com.rafaelfavetta.exercicios2.association.domain.Team;

public class PlayerTeamTest {
    public static void main(String[] args) {

        Team warriors = new Team("Golden State Warriors");

        warriors.addPlayer(new Player("S. Curry", 99, 35.5));
        warriors.addPlayer(new Player("D. Green", 84, 7.8));
        warriors.addPlayer(new Player("J. Butler III", 87, 25.6));
        warriors.addPlayer(new Player("G. Santos", 78, 10.2));
        warriors.addPlayer(new Player("A. Horford", 81, 11.9));

        System.out.println(warriors.averagePoints());
        System.out.println(warriors.bestPlayer().getName());
        System.out.println(warriors.bestPlayer().getName());
        System.out.println(warriors.averageOverall());
        System.out.println(warriors.sumPoints());
    }
}
