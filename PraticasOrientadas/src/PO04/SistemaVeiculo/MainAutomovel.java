package PO04.SistemaVeiculo;

public class MainAutomovel {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fusca", "Azul", 1990, 2);
        Veiculo moto = new Moto("CG 125", "Preto", 2020, true);

        System.out.println("Carro:");
        carro.ligar();
        carro.acelerar();
        carro.parar();

        System.out.println("\nMoto:");
        moto.ligar();
        moto.acelerar();
        moto.parar();
    }
}
