package cliente;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String nome, email, senha;
    private String nacionalidade;
    private ArrayList<String> postagens;
    
    public Usuario(String nome, String email, String senha, String nacionalidade) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nacionalidade = nacionalidade;
        this.postagens = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public static Usuario criarUsuario(Scanner scanner) {
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu email: ");
        String email = scanner.nextLine();

        System.out.print("Digite a sua nacionalidade: ");
        String nacionalidade = scanner.nextLine();

        System.out.print("Digite a sua senha: ");
        String senha = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.csv", true))) {
            writer.write(nome + ";" + email + ";" + nacionalidade + ";" + senha);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao gravar no arquivo CSV: " + e.getMessage());
        }

        return new Usuario(nome, email, senha, nacionalidade);
    }

    public void realizarNovaPostagem(Scanner scanner) {
        System.out.print("Faça sua nova postagem: ");
        String novaPostagem = scanner.nextLine();
        System.out.println(nome + " disse:");
        System.out.println(novaPostagem);
        
        postagens.add(novaPostagem);
    }

    public void exibirTodasPostagens() {
        if (postagens.isEmpty()) {
            System.out.println(nome + " não fez nenhuma postagem ainda.");
        } else {
            System.out.println(nome + " fez as seguintes postagens:");
            for (String postagem : postagens) {
                System.out.println(postagem);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo! Insira suas informações para entrar na rede social.");

        Usuario usuario = criarUsuario(scanner);

        int opcao;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Realizar nova postagem");
            System.out.println("2. Listar todas as postagens");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    usuario.realizarNovaPostagem(scanner);
                    break;
                case 2:
                    usuario.exibirTodasPostagens();
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}