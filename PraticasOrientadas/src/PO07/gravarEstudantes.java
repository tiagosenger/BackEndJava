package PO07;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gravarEstudantes {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudante> estudantes = new ArrayList<>();

        boolean adicionarEstudante;
        do {
            estudantes.add(obterDadosEstudante(scanner));
            System.out.print("Deseja adicionar outro estudante? (S/N): ");
            adicionarEstudante = scanner.nextLine().equalsIgnoreCase("S");
        } while (adicionarEstudante);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("estudantes.json"))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(estudantes);
            writer.write(json);
            System.out.println("Estudantes gravados com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo JSON: " + e.getMessage());
        }

        scanner.close();
    }

    private static Estudante obterDadosEstudante(Scanner scanner) {
        System.out.print("Nome do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("CPF do estudante: ");
        String cpf = scanner.nextLine();

        System.out.print("CRA do estudante: ");
        float cra = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Ano de admissão do estudante: ");
        int anoAdmissao = scanner.nextInt();
        scanner.nextLine(); 

        return new Estudante(nome, cpf, cra, anoAdmissao);
    }
}

