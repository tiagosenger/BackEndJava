package exercicioVector;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

    public static void inserirExibirInverso() {

        List<String> linkedList = new LinkedList<>();


        linkedList.add("Elemento 1");
        linkedList.add("Elemento 2");
        linkedList.add("Elemento 3");

        ListIterator<String> iterator = ((LinkedList<String>) linkedList).listIterator(linkedList.size());
        System.out.println("Elementos na ordem inversa:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
