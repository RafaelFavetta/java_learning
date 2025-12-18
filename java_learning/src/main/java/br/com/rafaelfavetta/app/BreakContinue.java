package br.com.rafaelfavetta.app;

public class BreakContinue {
    public static void main(String[] args) {

        for (int i = 0; i <=500; i+=50){

            if (i == 50 || i == 100){
                continue;
            } else if (i == 350) {
                break;
            }
            System.out.println(i);
        }
    }
}
