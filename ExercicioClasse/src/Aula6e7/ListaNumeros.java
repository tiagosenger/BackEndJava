package Aula6e7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaNumeros {
    private static ArrayList<Float> numeros;
    
    public ListaNumeros() {
        numeros = new ArrayList<>();
    }

    public void novoNumero(float numero) {
        numeros.add(numero);
    }

    public void listaNumeros() {
        System.out.println("Lista de Números:");
        for (Float numero : numeros) {
            System.out.println(numero);
        }
    }
    
    public float media(){
    	if (numeros.isEmpty()) {
    		return 0.0f;
    	}
    	
    	float soma = 0.0f;
    	for (Float numero : numeros) {
    		soma += numero;
    	}
    	
    	return soma / numeros.size();
    }
    
    public void ordena() {
    	Collections.sort(numeros);
    }
    
    public float mediana () {
    	int tamanho = numeros.size();
    	if (tamanho == 0) {
    		return 0.0f;
    	}
    	
    	ordena();
    	
    	if (tamanho % 2 == 0) {
    		int meio = tamanho / 2;
    		return (numeros.get(meio-1)+numeros.get(meio))/ 2.0f;
    	} else {
    		return numeros.get(tamanho / 2);
    	}
    }
    
    public void colocadoEm(int N) {
        if (numeros.isEmpty() || N <= 0 || N > numeros.size()) {
            System.out.println("N-ésimo maior número não disponível.");
            return;
        }

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println(N + "º maior número: " + numeros.get(N - 1));
    }

    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros();
        Scanner scanner = new Scanner(System.in);

        lista.novoNumero(10.5f);
        lista.novoNumero(20.3f);
        lista.novoNumero(15.8f);
        lista.novoNumero(12.0f);

        System.out.println("Números antes da ordenação: ");
        lista.listaNumeros();
        

        System.out.print("Digite um novo número: ");
        float novoNumero = scanner.nextFloat();
        lista.novoNumero(novoNumero);
        
        lista.ordena();
        
        System.out.print("Digite a posição desejada na lista: ");
        int posicao = scanner.nextInt();
        
        System.out.println("Números ordenados: ");
        lista.listaNumeros();
        
        System.out.println("Média: " + lista.media());
        
        float mediana = lista.mediana();
        System.out.println("Mediana dos números: " + mediana);
        
        lista.colocadoEm(posicao);
                
    scanner.close();
    }
}
