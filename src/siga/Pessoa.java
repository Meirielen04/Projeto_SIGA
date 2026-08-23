package siga;

public class Pessoa {
    protected String nome;
    protected String registro;
    protected boolean ativo;

    public Pessoa(String nome, String registro, boolean ativo) {
        this.nome = nome;
        this.registro = registro;
        this.ativo = ativo;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

     public String getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    public String apresentar() {
        return "Sou " + nome;
    }

}
