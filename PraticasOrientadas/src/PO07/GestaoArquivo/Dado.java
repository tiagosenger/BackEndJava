package PO07.GestaoArquivo;

public class Dado {
    private String nome;
    private int valor;

    public Dado(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
