package br.com.rafaelfavetta.exercicios3.enums.test;

import br.com.rafaelfavetta.exercicios3.enums.domain.Tyres;

public class RaceTest {
    public static void main(String[] args) {

        Tyres tyre = Tyres.SOFT;
        int totalLaps = 40;

        System.out.println("🏁 Corrida iniciada com pneu " + tyre);
        System.out.println("----------------------------------");

        for (int lap = 1; lap <= totalLaps; lap++) {
            System.out.println("Lap " + lap);

            if (tyre.isStillCompetitive(lap)) {
                System.out.println("✅ Pneu ainda competitivo");
            } else {
                System.out.println("❌ Pneu morreu! BOX! 🧯");
                break;
            }
        }
        System.out.println("----------------------------------");
        System.out.println("🏁 Fim da simulação");
    }
}
