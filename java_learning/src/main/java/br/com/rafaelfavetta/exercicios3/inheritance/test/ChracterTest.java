package br.com.rafaelfavetta.exercicios3.inheritance.test;

import br.com.rafaelfavetta.exercicios3.inheritance.domain.Archer;
import br.com.rafaelfavetta.exercicios3.inheritance.domain.Character;
import br.com.rafaelfavetta.exercicios3.inheritance.domain.Mage;
import br.com.rafaelfavetta.exercicios3.inheritance.domain.Warrior;

import java.util.ArrayList;
import java.util.List;

public class ChracterTest {
    public static void main(String[] args) {

        List<Character> characters = new ArrayList<>();

        characters.add(new Mage(10, "Weak Mage"));
        characters.add(new Mage(50, "Mid Mage"));
        characters.add(new Mage(150, "Good Mage"));
        characters.add(new Archer(150, "Good Archer"));
        characters.add(new Warrior(150, "Good Warrior"));
        characters.add(new Warrior(50, "Mid Warrior"));
        characters.add(new Archer(50, "Mid Archer"));
        characters.add(new Archer(10, "Weak Archer"));
        characters.add(new Warrior(10, "Weak Warrior"));

        for (Character c : characters){
            System.out.println(c.calculateDamage());
            c.attack();
        }

//        System.out.println(mage1.calculateDamage());
//        System.out.println(mage2.calculateDamage());
//        System.out.println(mage3.calculateDamage());
//        mage1.attack();
//        mage2.attack();
//        mage3.attack();
//        System.out.println();
//
//        System.out.println(warrior1.calculateDamage());
//        System.out.println(warrior2.calculateDamage());
//        System.out.println(warrior3.calculateDamage());
//        warrior1.attack();
//        warrior2.attack();
//        warrior3.attack();
//        System.out.println();
//
//        System.out.println(archer1.calculateDamage());
//        System.out.println(archer2.calculateDamage());
//        System.out.println(archer3.calculateDamage());
//        archer1.attack();
//        archer2.attack();
//        archer3.attack();
    }
}
