package PO05;

import java.util.List;

public class Trajeto {
    private String trechos;

    public Trajeto(String string) {
        this.trechos = string;
    }

	public String getTrechos() {
		return trechos;
	}

	public void setTrechos(String trechos) {
		this.trechos = trechos;
	}
}