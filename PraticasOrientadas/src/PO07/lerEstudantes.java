package PO07;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class lerEstudantes {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("estudantes.json")) {
            Gson gson = new Gson();
            List<Estudante> estudantes = gson.fromJson(reader, List.class);

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
}

