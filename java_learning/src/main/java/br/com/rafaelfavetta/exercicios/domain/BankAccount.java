package br.com.rafaelfavetta.exercicios.domain;

public class BankAccount {

    private double balance;
    private String holder;

    public BankAccount(double balance, String holder) {
        this.balance = balance;
        this.holder = holder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " reais foram depositados na conta.\nSaldo agora: " + balance + " reais.");
        } else {
            System.out.println("Não foi informado um valor válido. Depósito não realizado.\nO saldo se mantém: " + balance + " reais.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("O valor desejado para o saque é maior do que o saldo possui, portanto não será realizada a ação.\nO saldo contém " + balance + " reais.");
        } else {
            balance -= amount;
            System.out.println(amount + " reais foram sacados da conta.\nSaldo agora: " + balance + " reais.");
        }
    }


    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
