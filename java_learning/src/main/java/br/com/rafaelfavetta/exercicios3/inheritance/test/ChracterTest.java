package br.com.rafaelfavetta.exercicios3.inheritance.test;

import br.com.rafaelfavetta.exercicios3.inheritance.domain.Archer;
import br.com.rafaelfavetta.exercicios3.inheritance.domain.Character;
import br.com.rafaelfavetta.exercicios3.inheritance.domain.Mage;
import br.com.rafaelfavetta.exercicios3.inheritance.domain.Warrior;

public class ChracterTest {
    public static void main(String[] args) {

        Character mage1  = new Mage(10, "Weak Mage");
        Character mage2  = new Mage(20, "Mid Mage");
        Character mage3  = new Mage(50, "Good Mage");

        Character warrior1  = new Warrior(10, "Weak Warrior");
        Character warrior2  = new Warrior(20, "Mid Warrior");
        Character warrior3  = new Warrior(50, "Good Warrior");

        Character archer1  = new Archer(10, "Weak Archer");
        Character archer2  = new Archer(20, "Mid Arhcer");
        Character archer3  = new Archer(50, "Good Archer");

        System.out.println(mage1.calculateDamage());
        System.out.println(mage2.calculateDamage());
        System.out.println(mage3.calculateDamage());
        mage1.attack();
        mage2.attack();
        mage3.attack();
        System.out.println();

        System.out.println(warrior1.calculateDamage());
        System.out.println(warrior2.calculateDamage());
        System.out.println(warrior3.calculateDamage());
        warrior1.attack();
        warrior2.attack();
        warrior3.attack();
        System.out.println();

        System.out.println(archer1.calculateDamage());
        System.out.println(archer2.calculateDamage());
        System.out.println(archer3.calculateDamage());
        archer1.attack();
        archer2.attack();
        archer3.attack();
    }
}
