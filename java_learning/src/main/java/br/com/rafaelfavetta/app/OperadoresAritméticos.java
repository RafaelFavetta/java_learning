package br.com.rafaelfavetta.app;

public class OperadoresAritméticos {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        //jeito 1
        System.out.println("Soma: " + (a + b) + "\nSubtração: " + (a - b) + "\nMultiplicação: " + (a * b) + "\nDivisão: " + (double) (a / b) + "\nResto: " + (a % b));

        //jeito 2

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("------------------------"); //separador para visualizar melhor

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println((double) divisao);
        System.out.println(resto);
    }
}
