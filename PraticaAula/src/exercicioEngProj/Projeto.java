package exercicioEngProj;

public class Projeto {
	private String codigo;
	private String nome;
	private double orcamento;
	private Engenheiro engenheiroResponsavel;
	
	public Projeto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Projeto(String codigo, String nome, double orcamento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.orcamento = orcamento;
	}
	
	public Projeto(String codigo, String nome, double orcamento, Engenheiro engenheiroResponsavel) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.orcamento = orcamento;
		this.engenheiroResponsavel = engenheiroResponsavel;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getOrcamento() {
		return orcamento;
	}

	public Engenheiro getEngenheiroResponsavel() {
		return engenheiroResponsavel;
	}
	
	public void setEngenheiroResponsavel(Engenheiro engenheiroResponsavel) {
		this.engenheiroResponsavel = engenheiroResponsavel;
	}	
}
