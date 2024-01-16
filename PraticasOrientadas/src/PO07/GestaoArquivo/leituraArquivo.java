package PO07.GestaoArquivo;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leituraArquivo {
    public static void exibirConteudo(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(convertJsonToString(new JSONObject(linha)));
            }

        } catch (IOException | JSONException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private static String convertJsonToString(JSONObject jsonObject) {
        return jsonObject.getString("linha");
    }
}