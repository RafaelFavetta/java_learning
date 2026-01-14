package br.com.rafaelfavetta.exercicios.polimorphism.ex1.test;

import br.com.rafaelfavetta.exercicios.polimorphism.ex1.domain.Developer;
import br.com.rafaelfavetta.exercicios.polimorphism.ex1.domain.Manager;
import br.com.rafaelfavetta.exercicios.polimorphism.ex1.domain.Staff;

public class StaffTest01 {
    public static void main(String[] args) {

        Staff stf1 = new Manager("JoJo", 6000);
        Staff stf2 = new Manager("Quark", 4000);
        Staff stf3 = new Developer("Earl", 499.90);
        Staff stf4 = new Developer("Ragnar", 899);
        Staff stf5 = new Developer("Lagaertha", 1899.90);

        System.out.println("Bônus de " + stf1.getName() + ": " + stf1.calculateBonus());
        System.out.println("Salário total: " + stf1.calculateTotalSalary());
        System.out.println("\nBônus de " + stf2.getName() + ": " + stf2.calculateBonus());
        System.out.println("Salário total: " + stf2.calculateTotalSalary());
        System.out.println("\nBônus de " + stf3.getName() + ": " + stf3.calculateBonus());
        System.out.println("Salário total: " + stf3.calculateTotalSalary());
        System.out.println("\nBônus de " + stf4.getName() + ": " + stf4.calculateBonus());
        System.out.println("Salário total: " + stf4.calculateTotalSalary());
        System.out.println("\nBônus de " + stf5.getName() + ": " + stf5.calculateBonus());
        System.out.println("Salário total: " + stf5.calculateTotalSalary());
    }
}
