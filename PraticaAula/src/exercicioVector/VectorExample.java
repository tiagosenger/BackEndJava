package exercicioVector;

import java.util.Vector;

public class VectorExample {

    public static void adicionarRemoverElementos() {
        Vector<String> vector = new Vector<>();

        vector.add("Elemento A");
        vector.add("Elemento B");
        vector.add("Elemento C");

        System.out.println("Elementos antes da remoção: " + vector);

        vector.remove("Elemento B");

        System.out.println("Elementos após a remoção: " + vector);
    }
}
