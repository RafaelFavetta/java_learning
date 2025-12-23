package br.com.rafaelfavetta.model;

import br.com.rafaelfavetta.logic.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro mustang = new Carro();
        mustang.ano = 2011;
        mustang.modelo = "V8";
        mustang.nome = "Mustang Prolific";

        System.out.println(mustang.nome + " " + mustang.modelo + " " + mustang.ano);

        Carro bugatti = new Carro();
        bugatti.ano = 2015;
        bugatti.modelo = "V8";
        bugatti.nome = "Bugatti Veyron";

        System.out.println(bugatti.nome + " " + bugatti.modelo + " " + bugatti.ano);

        bugatti.acionarAirbag();
    }


}
