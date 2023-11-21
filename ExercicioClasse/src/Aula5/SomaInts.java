package Aula5;

import java.util.Random;

public class SomaInts {
	public static int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		int num1 = random.nextInt(100);
		int num2 = random.nextInt(100);
		
		int resultado = somar(num1,num2);
		System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultado);
	}
}