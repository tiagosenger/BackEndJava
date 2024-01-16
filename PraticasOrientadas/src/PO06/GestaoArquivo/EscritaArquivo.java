package PO06.GestaoArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritaArquivo {
	
	public static void main(String[] args) {
        String nomeArquivo = "saida.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite as linhas de texto (digite 'fim' para encerrar):");

            String linha;
            while (!(linha = scanner.nextLine()).equalsIgnoreCase("fim")) {
                writer.write(linha);
                writer.newLine();
            }

            System.out.println("Linhas gravadas com sucesso no arquivo " + nomeArquivo);

        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }

}
