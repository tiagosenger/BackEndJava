package PO07.GestaoArquivo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class escritaArquivo {

    public static void inserirLinhas(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite as linhas de texto (digite 'fim' para encerrar):");

            JSONArray jsonArray = new JSONArray();

            String linha;
            while (!(linha = scanner.nextLine()).equalsIgnoreCase("fim")) {
                jsonArray.put(convertStringToJson(linha));
            }

            writer.write(jsonArray.toString(2));
            writer.newLine();

            System.out.println("Linhas gravadas com sucesso no arquivo " + nomeArquivo);

        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }

    private static JSONObject convertStringToJson(String linha) {
        return new JSONObject().put("linha", linha);
    }
}

