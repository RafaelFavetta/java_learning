package br.com.rafaelfavetta.app;

public class OperadoresRelacionaisLogicos {
    public static void main(String[] args) {

        //lógicos
        int idade = 1;
        boolean temCarteira = false;

        if (idade >= 18 && temCarteira) {
            System.out.println("Você é maior de idade e pode dirigir.");
        } else if (idade >= 18 || temCarteira) {
            System.out.println("Você pode tentar dirigir.");
        } else {
            System.out.println("Você não pode dirigir porque é menor de idade.");
        }

        //atribuição
        int pontos = 10;

        pontos += 5;
        pontos -= 3;
        pontos *= 2;
        pontos /= 4;

        System.out.println(pontos);
    }
}
