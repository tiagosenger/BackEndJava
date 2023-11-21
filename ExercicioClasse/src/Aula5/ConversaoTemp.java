package Aula5;

import java.util.Scanner;

public class ConversaoTemp {
	
	public static double celsiusParaFahr(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");


        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double temperaturaCelsius = scanner.nextDouble();
            double resultado = celsiusParaFahr(temperaturaCelsius);
            System.out.println("A temperatura em Fahrenheit é: " + resultado);
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double temperaturaFahrenheit = scanner.nextDouble();
            double resultado = fahrParaCelsius(temperaturaFahrenheit);
            System.out.println("A temperatura em Celsius é: " + resultado);
        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}