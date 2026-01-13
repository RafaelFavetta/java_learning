package br.com.rafaelfavetta.exercicios.test;

import br.com.rafaelfavetta.exercicios.domain.BankAccount;

public class BankAccountTest01 {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(40000.65, "Rafael");

        bankAccount.withdraw(30000.65);
        bankAccount.deposit(4222);

        System.out.println(bankAccount);


        BankAccount bankAccount2 = new BankAccount(10, "Elisa");

        bankAccount2.withdraw(10.2);


    }
}
