package Aula5;

import java.util.Scanner;

public class CalculoAreaRetangulo {

    public static int calcularAreaRetangulo(int largura, int altura) {
        return largura * altura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        int largura = scanner.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        int altura = scanner.nextInt();

        int area = calcularAreaRetangulo(largura, altura);

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
