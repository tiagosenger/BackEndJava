package PO06.GestaoArquivo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class copiaArquivo {
    public static void copiar(String string) {
        String arquivoOrigem = "origem.txt";
        String arquivoDestino = "destino.txt";

        try (
            FileReader fileReader = new FileReader(arquivoOrigem);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

        	FileWriter fileWriter = new FileWriter(arquivoDestino);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            String linha;
            
            while ((linha = bufferedReader.readLine()) != null) {
                bufferedWriter.write(linha);
                bufferedWriter.newLine(); 
            }

            System.out.println("Cópia do arquivo concluída!");
        } catch (IOException e) {
            System.err.println("Erro durante a cópia do arquivo: " + e.getMessage());
        }
    }
}