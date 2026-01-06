package br.com.rafaelfavetta.test;

import br.com.rafaelfavetta.controleseminario.Aluno;
import br.com.rafaelfavetta.controleseminario.Local;
import br.com.rafaelfavetta.controleseminario.Professor;
import br.com.rafaelfavetta.controleseminario.Seminario;

public class TestAssociacaoSeminario {
    public static void main(String[] args) {

        Local localSeminario2026 = new Local("Rua Professor Vicente Casale Padovani");

        Aluno alunoSeminario = new Aluno("Rafael", 18);

        Aluno[] alunosSeminarioRafael = {};

        Professor professorSeminario = new Professor("Joca", "Sociologia");

        Seminario seminarioRafael = new Seminario("Judaísmo", alunosSeminarioRafael, localSeminario2026);

        Seminario[] seminariosDisponiveis = {seminarioRafael};

        professorSeminario.setSeminariosMinistrados(seminariosDisponiveis);
        professorSeminario.imprime();
    }
}
