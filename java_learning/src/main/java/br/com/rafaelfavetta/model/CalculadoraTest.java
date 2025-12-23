package br.com.rafaelfavetta.model;

import br.com.rafaelfavetta.logic.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 20);
    }
}
