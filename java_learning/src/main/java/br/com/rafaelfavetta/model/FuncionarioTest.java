package br.com.rafaelfavetta.model;

import br.com.rafaelfavetta.logic.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Jair";
        funcionario.idade = 19;
//        funcionario.salarios = new double[]{1200, 999.9, 200.44};

        funcionario.imprimeDados();
    }
}
