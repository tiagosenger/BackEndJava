package Aula5;

import java.util.Scanner;

public class VerificacaoMaiorIdade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data de nascimento:");
        System.out.print("Dia: ");
        int diaNascimento = scanner.nextInt();

        System.out.print("Mês: ");
        int mesNascimento = scanner.nextInt();

        System.out.print("Ano: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("\nDigite a data atual:");
        System.out.print("Dia: ");
        int diaAtual = scanner.nextInt();

        System.out.print("Mês: ");
        int mesAtual = scanner.nextInt();

        System.out.print("Ano: ");
        int anoAtual = scanner.nextInt();

        int idade = calcularIdade(diaNascimento, mesNascimento, anoNascimento, diaAtual, mesAtual, anoAtual);

        System.out.println("\nA idade é: " + idade + " anos.");

        scanner.close();
    }

    public static int calcularIdade(int diaNascimento, int mesNascimento, int anoNascimento, int diaAtual, int mesAtual, int anoAtual) {
        int idade = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        return idade;
    }
}

