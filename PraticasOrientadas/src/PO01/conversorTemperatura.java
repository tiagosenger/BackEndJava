package PO01;

import java.util.Scanner;

public class conversorTemperatura {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	
	    System.out.print("Digite a temperatura: ");
	    double temperatura = scanner.nextDouble();
	
	    System.out.println("Escolha a unidade de origem:");
	    System.out.println("1. Celsius");
	    System.out.println("2. Fahrenheit");
	
	    System.out.print("Digite o número da unidade de origem: ");
	    int escolha = scanner.nextInt();
	
	    double resultado = 0;
	
	    switch (escolha) {
	        case 1:
	            resultado = celsiusParaFahrenheit(temperatura);
	            break;
	        case 2:
	            resultado = fahrenheitParaCelsius(temperatura);
	            break;
	        default:
	            System.out.println("Opção inválida.");
	            return; 
	    }
	
	
	    System.out.println("O resultado da conversão é: " + resultado);
	
	
	    scanner.close();
	}
	
	
	private static double celsiusParaFahrenheit(double celsius) {
	    return (celsius * 9/5) + 32;
	}
	
	
	private static double fahrenheitParaCelsius(double fahrenheit) {
	    return (fahrenheit - 32) * 5/9;
	}
}