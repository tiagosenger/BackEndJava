package exercicioSet2;

import java.util.HashSet;
import java.util.Set;

public class Comunidade {
    private Set<Membro> membros;

    public Comunidade() {
        this.membros = new HashSet<>();
    }

    public void adicionarMembro(String nome, int numeroIdentificacao) throws IdentificacaoRepetidaException {
        Membro novoMembro = new Membro(nome, numeroIdentificacao);
        if (!membros.add(novoMembro)) {
            throw new IdentificacaoRepetidaException("Número de identificação repetido. Membro não adicionado.");
        }
    }

    public void exibirMembros() {
        System.out.println("Membros da comunidade:");
        for (Membro membro : membros) {
            System.out.println("Nome: " + membro.getNome() + ", Número de Identificação: " + membro.getNumeroIdentificacao());
        }
    }

    public void removerMembroPorIdentificacao(int numeroIdentificacao) {
        membros.removeIf(membro -> membro.getNumeroIdentificacao() == numeroIdentificacao);
    }
}
