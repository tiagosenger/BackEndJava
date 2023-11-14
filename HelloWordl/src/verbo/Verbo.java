package verbo;

public class Verbo {
	private String radical, sufixo;
	
	public Verbo(String _radical, String _sufixo) {
		super();
		this.radical = _radical;
		this.sufixo = _sufixo;
	}

	public String getRadical() {
		return radical;
	}

	public void setRadical(String _radical) {
		this.radical = _radical;
	}

	public String getSufixo() {
		return sufixo;
	}

	public void setSufixo(String _sufixo) {
		this.sufixo = _sufixo;
	}

	public void conjugar() {
		System.out.println("Eu "+radical+"o");
		System.out.println("Tu "+radical+"as");
		System.out.println("Ele "+radical+"a");
		System.out.println("Nos "+radical+"amos");
		System.out.println("Vos "+radical+"ais");
		System.out.println("Eles "+radical+"am");
	}
}
