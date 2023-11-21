package Aula5;

import java.util.Scanner;

public class ConcatenacaoStrings {
	
	public static String concatenarStrings(String str1, String str2) {
		return str1 + str2;
	}
	
	public static String solicitarString(String mensagem) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(mensagem);
		return scanner.nextLine();
	}
	
	public static void exibirString(String str) {
		System.out.println(str);
	}
	
	public static void fecharScanner() {
	Scanner scanner = new Scanner(System.in);
	scanner.close();
	}
	
	public static void main(String[] args) {
		String string1 = solicitarString("Digite a primeira string: ");
		String string2 = solicitarString("Digite a segunda string: ");
		
		String resultado = concatenarStrings(string1, string2);
			
		exibirString("A terceira string é: " + resultado);
		
		fecharScanner();
	}
}
