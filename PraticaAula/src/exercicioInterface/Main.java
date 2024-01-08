package exercicioInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<DadosEstatisticos> dadosList = new ArrayList<>();

        DataNascimento datasDeNascimento = new DataNascimento();
        datasDeNascimento.adicionarData(01/01/2023);
        datasDeNascimento.adicionarData(31/12/2023);
        dadosList.add(datasDeNascimento);

        TemperaturasDoPeriodo temperaturasDoPeriodo = new TemperaturasDoPeriodo();
        temperaturasDoPeriodo.adicionarTemperatura(25.5);
        temperaturasDoPeriodo.adicionarTemperatura(30.0);
        dadosList.add(temperaturasDoPeriodo);

        CidadesDoBrasil cidadesDoBrasil = new CidadesDoBrasil();
        cidadesDoBrasil.adicionarPopulacao(100000);
        cidadesDoBrasil.adicionarPopulacao(500000);
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
