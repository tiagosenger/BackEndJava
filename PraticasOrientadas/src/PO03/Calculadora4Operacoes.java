package PO03;

import java.util.Scanner;

public class Calculadora4Operacoes {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static float dividir(float a, float b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return a / b;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();

            int resultadoIntSoma = somar(numero1, numero2);
            System.out.println("Soma: " + resultadoIntSoma);

            int resultadoIntSubtracao = subtrair(numero1, numero2);
            System.out.println("Subtração: " + resultadoIntSubtracao);

            int resultadoIntMultiplicacao = multiplicar(numero1, numero2);
            System.out.println("Multiplicação: " + resultadoIntMultiplicacao);

            try {
                int resultadoIntDivisao = dividir(numero1, numero2);
                System.out.println("Divisão (int): " + resultadoIntDivisao);

            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Digite o primeiro número (float): ");
            float numero3 = scanner.nextFloat();

            System.out.print("Digite o segundo número (float): ");
            float numero4 = scanner.nextFloat();
            
            try {
                float resultadoFloatDivisao = dividir(numero3, numero4);
                System.out.println("Divisão (float): " + resultadoFloatDivisao);

            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, insira números válidos.");
        }
    }
}
