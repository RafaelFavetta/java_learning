package br.com.rafaelfavetta.exercicios.association.ex2.domain;

public class Order {

    private int orderNumber;
    private Product product;
    private int amount;

    public Order(int orderNumber, Product product, int amount) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.amount = amount;
    }

    public double calculateTotal(){
        return product.getPrice() * amount;
    }

    public void printData(){
        System.out.println("Produto: " + product.getName());
        System.out.println("Preço: " + product.getPrice());
        System.out.println("Quantidade: " + amount);
        System.out.println("Total: " + calculateTotal());
    }
}
