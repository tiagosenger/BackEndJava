package exercicioInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TemperaturasDoPeriodo implements DadosEstatisticos {
    private List<Double> temperaturas = new ArrayList<>();

    @Override
    public double maximo() {
        return Collections.max(temperaturas);
    }

    @Override
    public double minimo() {
        return Collections.min(temperaturas);
    }

    @Override
    public void ordenar() {
        Collections.sort(temperaturas);
    }

    @Override
    public boolean buscar(double valor) {
        return temperaturas.contains(valor);
    }

    public void adicionarTemperatura(double temperatura) {
        temperaturas.add(temperatura);
    }
}
