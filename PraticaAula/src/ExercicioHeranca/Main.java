package ExercicioHeranca;

import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	        List<Veiculo> veiculos = new ArrayList<>();

	        veiculos.add(new Carro("Civic", "Preto", 2022, 4));
	        veiculos.add(new Carro("Gol", "Branco", 2021, 2));

	        veiculos.add(new Caminhao("Volvo", "Azul", 2020, "Simples", 15000));
	        veiculos.add(new Caminhao("Scania", "Vermelho", 2022, "Duplo" , 20000));

	        for (Veiculo veiculo : veiculos) {
	            System.out.println("\nInformações do veículo:");
	            if (veiculo instanceof Carro) {
	           
	                ((Carro) veiculo).exibirInformacoes(false);
	            } else {
	                veiculo.exibirInformacoes();
	            }
	        }
	    }
}
