package PO07;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class lerEstudantes {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("estudantes.json")) {
            List<Estudante> estudantes = obterEstudantesDoJson(reader);

            if (estudantes != null && !estudantes.isEmpty()) {
                System.out.println("Lista de Estudantes:");
                for (Estudante estudante : estudantes) {
                    System.out.println(estudante);
                }
            } else {
                System.out.println("Nenhum estudante encontrado no arquivo.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }

    private static List<Estudante> obterEstudantesDoJson(Reader reader) throws IOException {
        List<Estudante> estudantes = new ArrayList<>();
        JSONTokener tokener = new JSONTokener(reader);
        JSONArray jsonArray = new JSONArray(tokener);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject estudanteJson = jsonArray.getJSONObject(i);
            Estudante estudante = new Estudante(
                    estudanteJson.getString("Nome"),
                    estudanteJson.getString("CPF"),
                    (float) estudanteJson.getDouble("CRA"),
                    estudanteJson.getInt("AnoDeAdmissao")
            );
            estudantes.add(estudante);
        }

        return estudantes;
    }
}


