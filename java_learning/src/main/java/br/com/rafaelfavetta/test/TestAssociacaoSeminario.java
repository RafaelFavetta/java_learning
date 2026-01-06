package br.com.rafaelfavetta.test;

import br.com.rafaelfavetta.controleseminario.Aluno;
import br.com.rafaelfavetta.controleseminario.Local;
import br.com.rafaelfavetta.controleseminario.Professor;
import br.com.rafaelfavetta.controleseminario.Seminario;

import java.util.Scanner;

public class TestAssociacaoSeminario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe abaixo seu endereço.");
        String enderecoSeminario = scanner.nextLine();
        Local localSeminario2026 = new Local(enderecoSeminario);

        System.out.println("Informe abaixo o nome do aluno.");
        String nomeAlunoSeminario = scanner.nextLine();

        System.out.println("Informe abaixo a idade do aluno.");
        int idadeAlunoSeminario = scanner.nextInt();
        scanner.nextLine(); //limpar o buffer

        Aluno alunoSeminario = new Aluno(nomeAlunoSeminario, idadeAlunoSeminario);
        Aluno[] alunosSeminario = {alunoSeminario};

        System.out.println("Informe abaixo o título do seminário.");
        String tituloSeminario = scanner.nextLine();
        Seminario seminario = new Seminario(tituloSeminario, alunosSeminario, localSeminario2026);
        Seminario[] seminarios2026 = {seminario};

        System.out.println("Informe abaixo o nome do professor ministrador.");
        String nomeProfessorMinistrador = scanner.nextLine();

        System.out.println("Informe abaixo a especialidade do professor ministrador.");
        String especiliadadeProfessorMinistrador = scanner.nextLine();

        Professor professorSeminario = new Professor(nomeProfessorMinistrador, especiliadadeProfessorMinistrador, seminarios2026);

        System.out.println();
        professorSeminario.imprime();

        scanner.close();
    }
}
