package exercicioVector;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Testando LinkedList:");
        LinkedListExample.inserirExibirInverso();
        System.out.println();


        System.out.println("Testando ArrayList:");
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayListExample.calcularMedia(numeros);
        System.out.println();


        System.out.println("Testando Vector:");
        VectorExample.adicionarRemoverElementos();
    }
}
