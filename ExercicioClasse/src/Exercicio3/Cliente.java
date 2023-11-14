package Exercicio3;

import java.util.Scanner;

public class Cliente {
	
	private String nome;
	private int idade = 0;
	private String CPF;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.CPF = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do cliente: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite CPF do cliente: ");
		String CPF = scanner.nextLine();
		
		Cliente cliente = new Cliente (nome, CPF);
		
		System.out.println("\nDados do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCPF());

        System.out.print("\nDigite a nova idade do cliente: ");
        int novaIdade = scanner.nextInt();
        cliente.setIdade(novaIdade);

        System.out.print("Digite o novo CPF do cliente: ");
        scanner.nextLine();
        String novoCpf = scanner.nextLine();
        cliente.setCPF(novoCpf);

        System.out.println("\nDados do Cliente Atualizados:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCPF());

        scanner.close();
    }
}
