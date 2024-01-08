package exercicioClasseAbs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataNascimento extends DadosEstatisticos {
    private List<Double> datas = new ArrayList<>();

    @Override
    public double maximo() {
        return Collections.max(datas);
    }

    @Override
    public double minimo() {
        return Collections.min(datas);
    }

    @Override
    public void ordenar() {
        Collections.sort(datas);
    }

    @Override
    public boolean buscar(double valor) {
        return datas.contains(valor);
    }

    public void adicionarData(double data) {
        datas.add(data);
    }
}