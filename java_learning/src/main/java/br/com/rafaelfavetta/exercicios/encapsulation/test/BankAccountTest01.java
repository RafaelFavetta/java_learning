package br.com.rafaelfavetta.exercicios.encapsulation.test;

import br.com.rafaelfavetta.exercicios.encapsulation.domain.BankAccount;

public class BankAccountTest01 {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(40000.65, "Rafael");

        bankAccount.withdraw(30000.65);
        bankAccount.deposit(4222);


        BankAccount bankAccount2 = new BankAccount(10, "Elisa");
        bankAccount2.withdraw(10.2);


    }
}
