package br.com.rafaelfavetta.exercicios2.inheritance.test;

import br.com.rafaelfavetta.exercicios2.inheritance.domain.Defender;
import br.com.rafaelfavetta.exercicios2.inheritance.domain.Player;
import br.com.rafaelfavetta.exercicios2.inheritance.domain.Playmaker;
import br.com.rafaelfavetta.exercicios2.inheritance.domain.Shooter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ImpactTest {
    public static void main(String[] args) {

        Player curry = new Shooter("Stephen Curry", 99);
        Player poole = new Shooter("Jordan Poole", 85);
        Player klay = new Shooter("Klay Thompson", 91);
        Player draymond = new Defender("Draymond Green", 84);
        Player butler = new Playmaker("Jimmy Butler", 89);
        Player guisantos = new Defender("Gui Santos", 80);

        List<Player> players = new ArrayList<>();
        players.add(curry);
        players.add(poole);
        players.add(klay);
        players.add(draymond);
        players.add(butler);
        players.add(guisantos);

        players.stream()
                .filter(player -> player.calculateImpact() > 112)
                .sorted(Comparator.comparing(Player::calculateImpact).reversed())
                .forEach(player ->
                        System.out.println(player.getName() + " - Impacto: " + player.calculateImpact())
                );

        System.out.println();

        for (Player p : players) {
            if (p instanceof Shooter shooter) {
                shooter.trainThreeBall();
            }
        }

        for (Player p : players) {
            if (p instanceof Playmaker playmaker) {
                playmaker.callPlays();
            }
        }
    }
}
