package exercicioManipulacaoTexto;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrieUmArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo (com extensão):");
        String nomeArquivo = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(nomeArquivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Digite as linhas de texto (digite uma linha vazia para encerrar):");

            String linha;
            do {
                linha = scanner.nextLine();
                if (!linha.isEmpty()) {
                    bufferedWriter.write(linha);
                    bufferedWriter.newLine();
                }
            } while (!linha.isEmpty());

            bufferedWriter.close();
            System.out.println("Arquivo criado com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
