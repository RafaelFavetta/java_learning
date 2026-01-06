package br.com.rafaelfavetta.controleseminario;

public class Professor {

    public Professor(String nomeProfessorSeminario) {
        this.nomeProfessorSeminario = nomeProfessorSeminario;
    }

    public Professor(String nomeProfessorSeminario, String especialidadeProfessorSeminario) {
        this.nomeProfessorSeminario = nomeProfessorSeminario;
        this.especialidadeProfessorSeminario = especialidadeProfessorSeminario;
    }

    public Professor(String nomeProfessorSeminario, String especialidadeProfessorSeminario, Seminario[] seminariosMinistrados) {
        this.nomeProfessorSeminario = nomeProfessorSeminario;
        this.especialidadeProfessorSeminario = especialidadeProfessorSeminario;
        this.seminariosMinistrados = seminariosMinistrados;
    }

    private String nomeProfessorSeminario;
    private String especialidadeProfessorSeminario;
    private Seminario[] seminariosMinistrados;

    public void imprime() {
        System.out.println("*******");
        System.out.print("Professor: " + this.nomeProfessorSeminario);
        if (this.especialidadeProfessorSeminario == null){
            return;
        }
        System.out.println(". Cuja especialidade é " + especialidadeProfessorSeminario);
        if (this.seminariosMinistrados == null) {
            return;
        }
        for (Seminario seminarioMinistrado : this.seminariosMinistrados) {
            System.out.println("Seminários: " + seminarioMinistrado.getTituloSeminario());
            System.out.println("Local: " + seminarioMinistrado.getLocalSeminario().getEnderecoLocalSeminario());
            if (seminarioMinistrado.getAlunosSeminario() == null || seminarioMinistrado.getAlunosSeminario().length == 0) {
                continue;
            }
            for (Aluno alunoSeminario : seminarioMinistrado.getAlunosSeminario()) {
                System.out.println("Aluno: " + alunoSeminario.getNomeAlunoSeminario() + ". De " + alunoSeminario.getIdadeAlunoSeminario() + " anos de idade");
            }
        }
    }

    public String getNomeProfessorSeminario() {
        return nomeProfessorSeminario;
    }

    public void setNomeProfessorSeminario(String nomeProfessorSeminario) {
        this.nomeProfessorSeminario = nomeProfessorSeminario;
    }

    public String getEspecialidadeProfessorSeminario() {
        return especialidadeProfessorSeminario;
    }

    public void setEspecialidadeProfessorSeminario(String especialidadeProfessorSeminario) {
        this.especialidadeProfessorSeminario = especialidadeProfessorSeminario;
    }

    public Seminario[] getSeminariosMinistrados() {
        return seminariosMinistrados;
    }

    public void setSeminariosMinistrados(Seminario[] seminariosMinistrados) {
        this.seminariosMinistrados = seminariosMinistrados;
    }
}
