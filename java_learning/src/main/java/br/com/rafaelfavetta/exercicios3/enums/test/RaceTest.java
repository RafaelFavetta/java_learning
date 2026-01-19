package br.com.rafaelfavetta.exercicios3.enums.test;

import br.com.rafaelfavetta.exercicios3.enums.domain.Tyres;

public class RaceTest {

    public static void main(String[] args) {

        Tyres tyre = Tyres.SOFT;

        int totalLaps = 76;
        int raceLap = 1;
        int tyreLap = 1;

        System.out.println("🏁 Largada com pneu " + tyre);

        while (raceLap <= totalLaps) {

            System.out.println(
                    "Lap " + raceLap +
                            " | Pneu: " + tyre +
                            " | Voltas no pneu: " + tyreLap
            );

            if (!tyre.isStillCompetitive(tyreLap)) {
                System.out.println("🔧 BOX! Trocando pneus...");
                tyre = changeTyre(tyre);
                tyreLap = 1;
            } else {
                tyreLap++;
            }

            raceLap++;
        }

        System.out.println("🏁 Corrida finalizada");
    }

    private static Tyres changeTyre(Tyres currentTyre) {
        return switch (currentTyre) {
            case SOFT -> Tyres.MEDIUM;
            case MEDIUM -> Tyres.HARD;
            case HARD -> Tyres.SOFT;
        };
    }
}
