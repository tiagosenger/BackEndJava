package exercicioVector;

import java.util.ArrayList;

public class ArrayListExample {

    public static void calcularMedia(ArrayList<Integer> numeros) {

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.size();

        System.out.println("Média dos números: " + media);
    }
}
