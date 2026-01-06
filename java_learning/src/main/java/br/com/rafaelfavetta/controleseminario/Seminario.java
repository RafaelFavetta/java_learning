package br.com.rafaelfavetta.controleseminario;

public class Seminario {

    public Seminario(String tituloSeminario) {
        this.tituloSeminario = tituloSeminario;
    }

    public Seminario(String tituloSeminario, Aluno[] alunosSeminario) {
        this.tituloSeminario = tituloSeminario;
        this.alunosSeminario = alunosSeminario;
    }

    public Seminario(String tituloSeminario, Aluno[] alunosSeminario, Local localSeminario) {
        this.tituloSeminario = tituloSeminario;
        this.alunosSeminario = alunosSeminario;
        this.localSeminario = localSeminario;
    }

    private String tituloSeminario;
    private Aluno[] alunosSeminario;
    private Local localSeminario;

    public Local getLocalSeminario() {
        return localSeminario;
    }

    public void setLocalSeminario(Local localSeminario) {
        this.localSeminario = localSeminario;
    }

    public String getTituloSeminario() {
        return tituloSeminario;
    }

    public void setTituloSeminario(String tituloSeminario) {
        this.tituloSeminario = tituloSeminario;
    }

    public Aluno[] getAlunosSeminario() {
        return alunosSeminario;
    }

    public void setAlunosSeminario(Aluno[] alunosSeminario) {
        this.alunosSeminario = alunosSeminario;
    }
}
