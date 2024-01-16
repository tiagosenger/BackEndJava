package PO07;

import java.util.Objects;

public class Estudante {
    private String nome;
    private String cpf;
    private float cra;
    private int anoDeAdmissao;

    public Estudante(String nome, String cpf, float cra, int anoDeAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.cra = cra;
        this.anoDeAdmissao = anoDeAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getCra() {
        return cra;
    }

    public void setCra(float cra) {
        this.cra = cra;
    }

    public int getAnoDeAdmissao() {
        return anoDeAdmissao;
    }

    public void setAnoDeAdmissao(int anoDeAdmissao) {
        this.anoDeAdmissao = anoDeAdmissao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return cpf.equals(estudante.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cra=" + cra +
                ", anoDeAdmissao=" + anoDeAdmissao +
                '}';
    }
}
