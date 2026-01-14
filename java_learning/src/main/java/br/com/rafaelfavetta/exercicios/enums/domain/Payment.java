package br.com.rafaelfavetta.exercicios.enums.domain;

public class Payment {

    private paymentType paymentType;
    private double price;

    public Payment(paymentType paymentType, double price) {
        this.paymentType = paymentType;
        this.price = price;
    }

    public void processPayment() {
        switch (paymentType) {
            case PIX -> System.out.println("Pagamento PIX utilizado");
            case BOLETO -> System.out.println("Pagamento em boleto utilizado");
            case DEBITO -> System.out.println("Pagamento em débito utilizado");
            case CREDITO -> System.out.println("Pagamento em crédito utilizado");
        }
    }
}
