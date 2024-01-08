package PO05;

public class Cobrador {
    private String nome;
    private String cpf;

    public Cobrador(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
