package PO04.SistemaVeiculo;

public class MainAutomovel {
    public static void main(String[] args) {
        Garagem garagemComTomada = new Garagem(true);
        Garagem garagemSemTomada = new Garagem(false);

        Veiculo carro = new Carro("Fusca", "Azul", 1990, false, 2);
        Veiculo carroEletrico = new Carro("Tesla", "Preto", 2022, true, 4);
        Veiculo moto = new Moto("CG 125", "Preto", 2020, false, true);

        carro.estacionar(garagemComTomada);
        carroEletrico.estacionar(garagemComTomada);
        moto.estacionar(garagemSemTomada);
    }
}
