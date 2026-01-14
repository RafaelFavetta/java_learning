package br.com.rafaelfavetta.exercicios.enums.test;

import br.com.rafaelfavetta.exercicios.enums.domain.Payment;
import br.com.rafaelfavetta.exercicios.enums.domain.paymentType;

public class PaymentTest01 {
    public static void main(String[] args) {

        Payment payment1 = new Payment(paymentType.PIX, 400.99);
        Payment payment2 = new Payment(paymentType.PIX, 33.99);
        Payment payment3 = new Payment(paymentType.BOLETO, 30.99);
        Payment payment4 = new Payment(paymentType.CREDITO, 3000);
        Payment payment5 = new Payment(paymentType.DEBITO, 700);

        payment1.processPayment();
        payment2.processPayment();
        payment3.processPayment();
        payment4.processPayment();
        payment5.processPayment();
    }
}
