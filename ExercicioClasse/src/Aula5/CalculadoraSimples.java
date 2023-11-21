package Aula5;

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.println("\nEscolha a operação:");
        System.out.println("A - Adição");
        System.out.println("S - Subtração");
        System.out.println("M - Multiplicação");
        System.out.println("D - Divisão");

        System.out.print("Opção: ");
        char opcao = scanner.next().charAt(0);

        float resultado = calcularResultado(num1, num2, opcao);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static float calcularResultado(float num1, float num2, char opcao) {
        switch (opcao) {
            case 'A':
                return num1 + num2;
            case 'S':
                return num1 - num2;
            case 'M':
                return num1 * num2;
            case 'D':           
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
            default:
                System.out.println("Opção inválida.");
                return Float.NaN;
        }
    }
}

