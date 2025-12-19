package br.com.rafaelfavetta.app;

public class Arrays {
    public static void main(String[] args) {

//        int[] arrBasico = {1,2,3,4,5,6,7,8,9,10,14,16};
//
//        for (int i = 0; i < arrBasico.length; i++){
//            System.out.println(arrBasico[i]);
//        }
//
//        System.out.println("------------------------");
//
//        for (int number : arrBasico){
//            System.out.println(number);
//        }

//        System.out.println("Esse é o tamanho do array: " + arrBasico.length);
//        System.out.println("Esse é o primeiro elemento do array: " + arrBasico[0]);
//        System.out.println("Esse é o último elemento do array: " + arrBasico[arrBasico.length - 1]);

        int[] arrInt = {1, 2, 7, 8, 3, 6, 7, 2 , 657, 231, 254};
        int numAlvo = 545;
        boolean isInArray = false;

        for (int arrNum : arrInt) {
            if (arrNum == numAlvo) {
                isInArray = true;
                break;
            }
        }

        if (isInArray){
            System.out.println("Encontrado. O número alvo era " + numAlvo + ".");
        } else {
            System.out.println("O número " + numAlvo + " não foi encontrado.");
        }
    }
}
