package br.com.rafaelfavetta.exercicios.association.domain;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void printData() {
        System.out.println("Relatório de dados de endereço");
        System.out.println("______________________________");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Número da moradia: " + endereco.getNumero());
        System.out.println("Cidade: " + endereco.getCidade());
    }
}
