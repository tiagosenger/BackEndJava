package exercicioSet1;

public class Main {
    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();

        listaDeCompras.adicionarItem("Arroz", 5.99f);
        listaDeCompras.adicionarItem("Feijão", 3.49f);
        listaDeCompras.adicionarItem("Carne", 12.99f);

        listaDeCompras.exibirTodosItens();

        listaDeCompras.exibirItensPorFaixaDeValor(6);

        listaDeCompras.removerItemPorNome("Feijão");

        listaDeCompras.exibirTodosItens();
    }
}
