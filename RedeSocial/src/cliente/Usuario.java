package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome, email, nacionalidade;
	private int qtdPostagens = 0;
	
	private ArrayList<String> postagens;

	public Usuario(String nome, String email, String nacionalidade) {
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.postagens = new ArrayList<String>();
		this.qtdPostagens = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void adicionaPostagem(String post) {
		postagens.add(post);
		qtdPostagens++;
	}
	
	public int getQtdPostagens() {
		return qtdPostagens;
	}

	public void setQtdPostagens(int qtdPostagens) {
		this.qtdPostagens = qtdPostagens;
	}
	
    public void realizarNovaPostagem(Scanner scanner) {
        System.out.print("Deseja fazer uma nova postagem? (S/N): ");
        String resposta = scanner.nextLine().toUpperCase();

        if (resposta.equals("S")) {
            System.out.print("Faça sua nova postagem: ");
            String novaPostagem = scanner.nextLine();

            System.out.println(nome + " disse:");
            System.out.println(novaPostagem);

            adicionaPostagem(novaPostagem);
            realizarNovaPostagem(scanner);
        }
    }

	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
						
		System.out.print("Olá! Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite agora o seu email: ");
		String email = scanner.nextLine();
		
		System.out.print("E qual sua nacionalidade?: ");
		String nacionalidade = scanner.nextLine();
		
		Usuario usuario1 = new Usuario (nome, email, nacionalidade);
		
		System.out.print("Faça sua primeira postagem abaixo!");
		String postagem = scanner.nextLine();
		
		System.out.println(nome+" disse:");
		System.out.println(postagem);
		
		usuario1.adicionaPostagem(postagem);
		
		usuario1.realizarNovaPostagem(scanner);
		
		System.out.println(nome + " já fez o total de " + usuario1.qtdPostagens + "postagens");
		
		scanner.close();	
	}
}
