package ExercicioHeranca;

public class Veiculo {
	private String modelo;
	private String cor;
	private int anoFabricacao;
	
	public Veiculo(String modelo, String cor, int anoFabricacao) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
	}
	
	public void exibirInformacoes() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Ano de fabricação: " + anoFabricacao);
	}
}
