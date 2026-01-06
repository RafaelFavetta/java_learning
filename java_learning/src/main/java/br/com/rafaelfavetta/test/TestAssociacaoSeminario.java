package br.com.rafaelfavetta.test;

import br.com.rafaelfavetta.controleseminario.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestAssociacaoSeminario {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        String enderecoSeminario = read("Informe abaixo o endereço do seminário:");
        Local localSeminario2026 = new Local(enderecoSeminario);

        String nomeAlunoSeminario = read("Informe abaixo o nome do aluno:");
        int idadeAlunoSeminario = readInt("Informe abaixo a idade do aluno:");

        Aluno alunoSeminario = new Aluno(nomeAlunoSeminario, idadeAlunoSeminario);
        Aluno[] alunosSeminario = {alunoSeminario};

        String tituloSeminario = read("Informe abaixo o título do seminário:");
        Seminario seminario = new Seminario(tituloSeminario, alunosSeminario, localSeminario2026);

        Seminario[] seminarios2026 = {seminario};

        String nomeProfessorMinistrador = read("Informe abaixo o nome do professor ministrador:");

        String especialidadeProfessorMinistrador = read("Informe abaixo a especialidade do professor ministrador:");

        Professor professorSeminario = new Professor(nomeProfessorMinistrador, especialidadeProfessorMinistrador, seminarios2026);

        System.out.println();
        professorSeminario.imprime();
    }


    private static String read(String mensagem) {
        System.out.println(mensagem);
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler dados do terminal", e);
        }
    }

    private static int readInt(String mensagem) {
        while (true) {
            try {
                return Integer.parseInt(read(mensagem));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número.");
            }
        }
    }
}