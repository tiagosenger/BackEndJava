package Aula5;

import java.util.Scanner;

public class TrocaVariaveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da primeira variável (A): ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor da segunda variável (B): ");
        int b = scanner.nextInt();

        System.out.println("Valores antes da troca:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nValores após a troca:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        scanner.close();
    }
}

