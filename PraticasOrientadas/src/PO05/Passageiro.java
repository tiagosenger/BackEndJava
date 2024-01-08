package PO05;

public class Passageiro {
    private String nome;
    private String cartao;

    public Passageiro(String nome, String cartao) {
        this.nome = nome;
        this.cartao = cartao;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
    public void embarcarComCartao(PontoDeParada pontoDeParada) {
        System.out.println(nome + " embarcou com cartão no ponto " + pontoDeParada.getNome());
    }
}