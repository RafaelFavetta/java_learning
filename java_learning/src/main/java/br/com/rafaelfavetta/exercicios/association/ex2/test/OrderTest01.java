package br.com.rafaelfavetta.exercicios.association.ex2.test;

import br.com.rafaelfavetta.exercicios.association.ex2.domain.Order;
import br.com.rafaelfavetta.exercicios.association.ex2.domain.Product;

public class OrderTest01 {
    public static void main(String[] args) {

        Product product = new Product("Linha", 5.20);

        Order order = new Order(1, product, 15);

        order.printData();

    }
}
