package br.com.rafaelfavetta.exercicios.polymorphism.ex1.test;

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
            System.out.println();
        }
    }
}
