package br.com.rafaelfavetta.model;

import br.com.rafaelfavetta.logic.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 20);
        calculadora.divisaoDoisNumeros(45.6, 90.3);
        System.out.println(calculadora.divisaoDoisNumeros(45.6, 23.4));
        calculadora.imprimirDivisao(4444, 9);
    }
}
