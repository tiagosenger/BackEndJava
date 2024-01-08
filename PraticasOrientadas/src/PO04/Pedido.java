package PO04;

import java.util.ArrayList;
import java.util.List;

class ItemPedido {
    private String descricao;
    private double preco;

    public ItemPedido(String descricao, double preco) {
        this.setDescricao(descricao);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

public class Pedido {
    private int numeroPedido;
    private String cpfCliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int numeroPedido, String cpfCliente) {
        this.numeroPedido = numeroPedido;
        this.cpfCliente = cpfCliente;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void adicionarItens(List<ItemPedido> itensNovos) {
        itens.addAll(itensNovos);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public double calcularTotalComDesconto(double percentualDesconto) {
        double total = calcularTotal();
        double desconto = (percentualDesconto / 100) * total;
        return total - desconto;
    }

    public double calcularTotalAPrazo(int numPrestacoes, double juros) {
        double total = calcularTotal();
        return total + (total * (juros / 100) * numPrestacoes);
    }

    public void exibirInformacoes() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("CPF do Cliente: " + cpfCliente);
        System.out.println("Itens do Pedido:");

        for (ItemPedido item : itens) {
            System.out.println("Descrição: " + item.getDescricao() + ", Preço: " + item.getPreco());
        }
    }

    public static void main(String[] args) {

        Pedido pedidoSemDesconto = new Pedido(1, "123.456.789-01");

        ItemPedido item1 = new ItemPedido("Produto A", 50.0);
        ItemPedido item2 = new ItemPedido("Produto B", 30.0);

        pedidoSemDesconto.adicionarItem(item1);
        pedidoSemDesconto.adicionarItem(item2);

        System.out.println("Total do Pedido Sem Desconto: " + pedidoSemDesconto.calcularTotal());
        pedidoSemDesconto.exibirInformacoes();
        
        System.out.println("- - - - - - - - - - - - - - - - - -");

        Pedido pedidoComDesconto = new Pedido(2, "987.654.321-00");

        ItemPedido item3 = new ItemPedido("Produto C", 80.0);
        ItemPedido item4 = new ItemPedido("Produto D", 40.0);

        pedidoComDesconto.adicionarItem(item3);
        pedidoComDesconto.adicionarItem(item4);

        System.out.println("Total do Pedido Com Desconto: " + pedidoComDesconto.calcularTotalComDesconto(10));
        pedidoComDesconto.exibirInformacoes();
    }
}
