package Aula5;

import java.util.Scanner;

public class ConversaoTemp2 {

    public static double converterTemperatura(double temperatura, int tipo) {
        if (tipo == 0) {
            return (temperatura * 9 / 5) + 32;
        } else if (tipo == 1) {
            return (temperatura - 32) * 5 / 9;
        } else {
            System.out.println("Tipo de conversão inválido.");
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Escolha o tipo de temperatura (0 para Celsius, 1 para Fahrenheit): ");
        int tipo = scanner.nextInt();

        double resultado = converterTemperatura(temperatura, tipo);

        System.out.println("O resultado da conversão é: " + resultado);

        scanner.close();
    }
}