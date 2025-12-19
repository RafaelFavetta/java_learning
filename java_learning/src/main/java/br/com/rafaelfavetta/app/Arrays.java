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

//        int[] arrInt = {1, 2, 7, 8, 3, 6, 7, 2 , 657, 231, 254};
//        int numAlvo = 545;
//        boolean isInArray = false;
//
//        for (int arrNum : arrInt) {
//            if (arrNum == numAlvo) {
//                isInArray = true;
//                break;
//            }
//        }
//
//        if (isInArray){
//            System.out.println("Encontrado. O número alvo era " + numAlvo + ".");
//        } else {
//            System.out.println("O número " + numAlvo + " não foi encontrado.");
//        }

//        int[] arrInt = {1,2,3,4,5,6,7,8,9,10,11,12,13,75,35,22,111};

//        int numPares = 0;
//        int numImpares = 0;
//
//        for (int arrNum : arrInt){
//            if (arrNum % 2 == 0){
//                System.out.println(arrNum + " é par.");
//                numPares++;
//            } else {
//                System.out.println(arrNum + " é ímpar.");
//                numImpares++;
//            }
//        }
//
//        System.out.println("Quantidade de números pares informados: " + numPares + ".");
//        System.out.println("Quantidade de números ímpares informados: " + numImpares + ".");

//        double[] arrDouble = {2.3,424.4,243.4,21.3,87.11,8.1,45.1,1.9,3.0};
//        double arrSoma = 0;
//
//        for (double arrNum : arrDouble){
//            arrSoma += arrNum;
//        }
//
//        double arrMedia = (arrSoma / arrDouble.length);
//
//        System.out.printf("A soma foi: %.2f%n" , arrSoma);
//        System.out.printf("A média foi:  %.2f%n" , arrMedia);

        int[] arrInt = {1, 3, 5, 7, 8, 2, 0};

        int arrMaior = arrInt[0];
        int arrMenor = arrInt[0];

        for (int i : arrInt) {
            if (i > arrMaior){
                arrMaior = i;
            }
            if (i < arrMenor){
                arrMenor = i;
            }
        }

        System.out.println(arrMaior);
        System.out.println(arrMenor);
    }
}
