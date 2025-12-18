package br.com.rafaelfavetta.app;

public class IfElse {
    public static void main(String[] args) {

        double notaAluno = 8;

//        if (notaAluno >= 7){
//            System.out.println("Aprovado.");
//        } else if (notaAluno >= 5) {
//            System.out.println("Recuperação.");
//        } else {
//            System.out.println("Reprovado.");
//        }

        String resultadoFinal = notaAluno >= 7 ? "Aprovado" : notaAluno >=5 ? "Recuperação" : "Reprovado";
        System.out.println(resultadoFinal);
    }
}
