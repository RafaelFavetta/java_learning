package br.com.rafaelfavetta.logic;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 14);
    }

    public void multiplicaDoisNumeros(int primeiroNumero, int segundoNumero){
        System.out.println(primeiroNumero * segundoNumero);
    }

    public double divisaoDoisNumeros(double primeiroNumero, double segundoNumero){
        if (segundoNumero == 0){
            return 0;
        }
        return primeiroNumero / segundoNumero;
    }

    public void imprimirDivisao(double num1, double num2){
        if (num2 == 0){
            System.out.println("Divisão inválida");
            return;
        }
        System.out.println(num1 / num2);
    }
}
