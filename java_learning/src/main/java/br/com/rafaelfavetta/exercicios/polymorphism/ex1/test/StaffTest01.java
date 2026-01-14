package br.com.rafaelfavetta.exercicios.polymorphism.ex1.test;

import br.com.rafaelfavetta.exercicios.polymorphism.ex1.auth.Authenticable;
import br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain.Cliente;
import br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain.Developer;
import br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain.Manager;
import br.com.rafaelfavetta.exercicios.polymorphism.ex1.domain.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffTest01 {
    public static void main(String[] args) {

        List<Staff> staffs = new ArrayList<>();

        staffs.add(new Manager("JoJo", 6000));
        staffs.add(new Manager("Quark", 4000));
        staffs.add(new Developer("Earl", 499.90));
        staffs.add(new Developer("Ragnar", 899));
        staffs.add(new Developer("Lagaertha", 1899.90));

        for (Staff s : staffs) {
            System.out.println(s.getName());
            System.out.println(s.calculateBonus());
            System.out.println(s.calculateTotalSalary());
            if (s instanceof Manager manager) {
                System.out.println(manager.approveBudget());
            }
            System.out.println();
        }

        Authenticable auth1 = new Manager("Rafael", 5000, "123");
        Authenticable auth2 = new Developer("Maria", 2000, "54321");
        Authenticable auth3 = new Cliente("Ney", 1000000000, "neymar");

        System.out.println(auth1.authenticate("2323"));
        System.out.println(auth1.authenticate("123"));
    }
}
