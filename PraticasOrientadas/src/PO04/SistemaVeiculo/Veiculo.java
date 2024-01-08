package PO04.SistemaVeiculo;

public class Veiculo {
    private String modelo;
    private String cor;
    private int ano;
    private boolean eletrico;

    public Veiculo(String modelo, String cor, int ano, boolean eletrico) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.eletrico = eletrico;
    }

    public void acelerar() {
        System.out.println("Veículo acelerando");
    }

    public void ligar() {
        System.out.println("Veículo ligado");
    }

    public void parar() {
        System.out.println("Veículo parado");
    }

    public void estacionar(Garagem garagem) {
        garagem.estacionarVeiculo(this);
    }

    public boolean isEletrico() {
        return eletrico;
    }
}
