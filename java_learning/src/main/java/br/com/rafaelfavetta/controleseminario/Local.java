package br.com.rafaelfavetta.controleseminario;

public class Local {

    public Local(String enderecoLocalSeminario) {
        this.enderecoLocalSeminario = enderecoLocalSeminario;
    }

    private String enderecoLocalSeminario;

    public String getEnderecoLocalSeminario() {
        return enderecoLocalSeminario;
    }

    public void setEnderecoLocalSeminario(String enderecoLocalSeminario) {
        this.enderecoLocalSeminario = enderecoLocalSeminario;
    }
}
