package ExercicioHeranca;

public class Caminhao extends Veiculo{
	private String tipoDeEixo; 
	private int capacidadeMaxima;

	public Caminhao(String modelo, String cor, int anoFabricacao, String tipoDeEixo, int capacidadeMaxima) {
		super(modelo, cor, anoFabricacao);
		this.tipoDeEixo = tipoDeEixo;
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Tipo de Eixo: " + tipoDeEixo);
		System.out.println("Capacidade Máxima: " + capacidadeMaxima + " Kilos");
	}
}
