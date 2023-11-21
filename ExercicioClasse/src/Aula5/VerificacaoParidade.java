package Aula5;

import java.util.Scanner;

public class VerificacaoParidade {
	
	public static String verificarParidade(int numero) {
		if (numero % 2 == 0) {
			return "O número é par.";
		} else {
			return "O número é impar.";
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		
		int numero = scanner.nextInt();
		
		String resultado = verificarParidade(numero);
		System.out.println(resultado);
		
		scanner.close();		
	}
}
