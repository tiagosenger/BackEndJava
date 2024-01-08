package exercicioClasseAbs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<DadosEstatisticos> dadosList = new ArrayList<>();

        DataNascimento datasDeNascimento = new DataNascimento();
        datasDeNascimento.adicionarData(20220101);
        datasDeNascimento.adicionarData(20211231);
        dadosList.add(datasDeNascimento);

        TemperaturasDoPeriodo temperaturasDoPeriodo = new TemperaturasDoPeriodo();
        temperaturasDoPeriodo.adicionarTemperatura(25.5);
        temperaturasDoPeriodo.adicionarTemperatura(30.0);
        dadosList.add(temperaturasDoPeriodo);

        CidadesDoBrasil cidadesDoBrasil = new CidadesDoBrasil();
        cidadesDoBrasil.adicionarPopulacao(1000000);
        cidadesDoBrasil.adicionarPopulacao(5000000);
        dadosList.add(cidadesDoBrasil);

        for (DadosEstatisticos dados : dadosList) {
            System.out.println("Máximo: " + dados.maximo());
            System.out.println("Mínimo: " + dados.minimo());
            System.out.println("Ordenado: ");
            dados.ordenar();

            System.out.println("Busca: " + dados.buscar(25.5));
            System.out.println("-------------------");
        }
    }
}
