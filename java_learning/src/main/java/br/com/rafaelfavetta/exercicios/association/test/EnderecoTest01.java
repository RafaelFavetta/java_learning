package br.com.rafaelfavetta.exercicios.association.test;

import br.com.rafaelfavetta.exercicios.association.domain.Endereco;
import br.com.rafaelfavetta.exercicios.association.domain.Pessoa;

public class EnderecoTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Constantino", 20, "Viena");

        Pessoa pessoa = new Pessoa("Fábio", 34, endereco);

        pessoa.printData();
    }
}
