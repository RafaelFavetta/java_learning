package br.com.rafaelfavetta.exercicios.finals.test;

import br.com.rafaelfavetta.exercicios.finals.domain.UtilCalculator;

public class CalculatorTest01 {
    public static void main(String[] args) {

        double sum = UtilCalculator.sum(2.7,5.3);
        double sub = UtilCalculator.sub(0.21,2.8);

        System.out.println(sum);
        System.out.println(sub);

    }
}
