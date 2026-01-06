package br.com.rafaelfavetta.controleseminario;

public class Aluno {

    public Aluno(String nomeAlunoSeminario, int idadeAlunoSeminario) {
        this.nomeAlunoSeminario = nomeAlunoSeminario;
        this.idadeAlunoSeminario = idadeAlunoSeminario;
    }

    private String nomeAlunoSeminario;
    private int idadeAlunoSeminario;
    private Seminario seminario;

    public String getNomeAlunoSeminario() {
        return nomeAlunoSeminario;
    }

    public void setNomeAlunoSeminario(String nomeAlunoSeminario) {
        this.nomeAlunoSeminario = nomeAlunoSeminario;
    }

    public int getIdadeAlunoSeminario() {
        return idadeAlunoSeminario;
    }

    public void setIdadeAlunoSeminario(int idadeAlunoSeminario) {
        this.idadeAlunoSeminario = idadeAlunoSeminario;
    }
}
