package exercicioInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CidadesDoBrasil implements DadosEstatisticos {
    private List<Double> populacoes = new ArrayList<>();

    @Override
    public double maximo() {
        return Collections.max(populacoes);
    }

    @Override
    public double minimo() {
        return Collections.min(populacoes);
    }

    @Override
    public void ordenar() {
        Collections.sort(populacoes);
    }

    @Override
    public boolean buscar(double valor) {
        return populacoes.contains(valor);
    }

    public void adicionarPopulacao(double populacao) {
        populacoes.add(populacao);
    }
}
