package PO07;

import java.util.Scanner;

public class mainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Adicionar Estudantes e Gravar em Arquivo JSON");
            System.out.println("2. Ler Estudantes do Arquivo JSON");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            String opcaoStr = scanner.next();

            try {
                opcao = Integer.parseInt(opcaoStr);
            } catch (NumberFormatException e) {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    gravarEstudantes.main(args);
                    break;
                case 2:
                    lerEstudantes.main(args);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}




