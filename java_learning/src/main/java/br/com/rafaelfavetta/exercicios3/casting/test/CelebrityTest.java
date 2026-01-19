package br.com.rafaelfavetta.exercicios3.casting.test;

import br.com.rafaelfavetta.exercicios3.casting.domain.Actor;
import br.com.rafaelfavetta.exercicios3.casting.domain.Celebrity;
import br.com.rafaelfavetta.exercicios3.casting.domain.Singer;

import java.util.ArrayList;
import java.util.List;

public class CelebrityTest {
    public static void main(String[] args) {

        List<Celebrity> celebrities = new ArrayList<>();

        celebrities.add(new Actor(14));
        celebrities.add(new Actor(34));
        celebrities.add(new Actor(4));
        celebrities.add(new Actor(1));
        celebrities.add(new Actor(16));

        celebrities.add(new Singer(9));
        celebrities.add(new Singer(19));
        celebrities.add(new Singer(5));
        celebrities.add(new Singer(13));
        celebrities.add(new Singer(10));

        for (Celebrity c : celebrities) {
            System.out.println(c.getYearsOfCareer());

            if (c instanceof Actor) {
                ((Actor) c).act();
            }
            if (c instanceof Singer) {
                ((Singer) c).sing();
            }
        }
    }
}
