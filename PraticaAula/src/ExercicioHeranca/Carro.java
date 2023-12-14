package ExercicioHeranca;

public class Carro extends Veiculo {
	private int numeroPortas;

	public Carro(String modelo, String cor, int anoFabricacao, int numeroPortas) {
		super(modelo, cor, anoFabricacao);
		this.numeroPortas = numeroPortas;
	}
	
    public void exibirInformacoes(boolean mostrarNumeroPortas) {
        super.exibirInformacoes();
        if (mostrarNumeroPortas) {
            System.out.println("Número de portas: " + numeroPortas);
        }
    }
}
