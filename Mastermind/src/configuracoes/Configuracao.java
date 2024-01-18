package configuracoes;

public class Configuracao {
    private String alfabeto;

    public String getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String alfabeto) {
        if (alfabeto == null || alfabeto.length() < 1) {
            throw new IllegalArgumentException("O alfabeto deve possuir mais de 1 caracter");
        }
        this.alfabeto = alfabeto;
    }
}

