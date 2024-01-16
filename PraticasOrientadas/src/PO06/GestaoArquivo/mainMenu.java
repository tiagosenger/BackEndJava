package PO06.GestaoArquivo;

import java.util.Scanner;

public class mainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    leituraArquivo.exibirConteudo("entrada.txt");
                    break;
                case 2:
                    escritaArquivo.inserirLinhas("saida.txt");
                    break;
                case 3:
                    copiaArquivo.copiar("origem.txt");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nSelecione uma opção:");
        System.out.println("1. Exibir conteúdo do arquivo 'entrada.txt'");
        System.out.println("2. Inserir linhas de texto e salvar em 'saida.txt'");
        System.out.println("3. Copiar conteúdo de 'origem.txt' para 'destino.txt'");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }
}