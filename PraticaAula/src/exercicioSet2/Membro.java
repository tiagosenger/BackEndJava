package exercicioSet2;

import java.util.Objects;

public class Membro {
    private String nome;
    private int numeroIdentificacao;

    public Membro(String nome, int numeroIdentificacao) {
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membro membro = (Membro) o;
        return numeroIdentificacao == membro.numeroIdentificacao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroIdentificacao);
    }
}
