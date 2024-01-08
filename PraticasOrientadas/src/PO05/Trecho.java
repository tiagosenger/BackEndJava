package PO05;

public class Trecho {
    private PontoDeParada origem;
    private PontoDeParada destino;
    private int duracaoEstimada;

    public Trecho(PontoDeParada origem, PontoDeParada destino, int duracaoEstimada) {
        this.origem = origem;
        this.destino = destino;
        this.duracaoEstimada = duracaoEstimada;
    }

	public PontoDeParada getOrigem() {
		return origem;
	}

	public void setOrigem(PontoDeParada origem) {
		this.origem = origem;
	}

	public PontoDeParada getDestino() {
		return destino;
	}

	public void setDestino(PontoDeParada destino) {
		this.destino = destino;
	}

	public int getDuracaoEstimada() {
		return duracaoEstimada;
	}

	public void setDuracaoEstimada(int duracaoEstimada) {
		this.duracaoEstimada = duracaoEstimada;
	}
}