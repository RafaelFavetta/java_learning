package br.com.rafaelfavetta.app;

public class IfElse {
    public static void main(String[] args) {

        double notaAluno = 4.99;

        if (notaAluno >= 7){
            System.out.println("Aprovado.");
        } else if (notaAluno >= 5) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
