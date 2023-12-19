package exercicioSet1;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Item> listaDeItens;

    public ListaDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco) {
        Item novoItem = new Item(nome, preco);
        listaDeItens.add(novoItem);
    }

    public void exibirTodosItens() {
        System.out.println("Itens na lista de compras:");
        for (Item item : listaDeItens) {
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco());
        }
    }

    public void exibirItensPorFaixaDeValor(float limiteInferior, float limiteSuperior) {
        System.out.println("Itens na faixa de valor entre " + limiteInferior + " e " + limiteSuperior + ":");
        for (Item item : listaDeItens) {
            if (item.getPreco() >= limiteInferior && item.getPreco() <= limiteSuperior) {
                System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco());
            }
        }
    }

    public void exibirItensPorFaixaDeValor(float limiteSuperior) {
        exibirItensPorFaixaDeValor(0, limiteSuperior);
    }

    public void removerItemPorNome(String nome) {
        listaDeItens.removeIf(item -> item.getNome().equals(nome));
    }
}
