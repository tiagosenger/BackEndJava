package exercicioSet2;

public class Main {
    public static void main(String[] args) {
        Comunidade comunidade = new Comunidade();

        try {
            comunidade.adicionarMembro("João", 101);
            comunidade.adicionarMembro("Maria", 102);
            comunidade.adicionarMembro("Carlos", 103);

            comunidade.exibirMembros();

            comunidade.adicionarMembro("Ana", 101);  

        } catch (IdentificacaoRepetidaException e) {
            System.out.println(e.getMessage());
        }

        comunidade.removerMembroPorIdentificacao(102);

        comunidade.exibirMembros();
    }
}
