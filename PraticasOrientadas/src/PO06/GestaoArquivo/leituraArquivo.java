package PO06.GestaoArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leituraArquivo {
	public static void exibirConteudo(String string) {
        String nomeArquivo = "entrada.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
