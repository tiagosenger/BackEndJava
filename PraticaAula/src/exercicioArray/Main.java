package exercicioArray;

import exercicioArray.MetodosArray.NomeNaoEncontradoException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Verificar Nome no Array: " + MetodosArray.verificarNomeArray("Degas"));
        System.out.println("Verificar Nome na Lista: " + MetodosArray.verificarNomeLista("Tiago"));

        try {
            MetodosArray.modificarNomeArray("Tiago", "Tiagol");
            System.out.println("Array após modificação: " + Arrays.toString(MetodosArray.getNomesArray()));
        } catch (NomeNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            MetodosArray.modificarNomeLista("Paulo", "Paulo Ricardo");
            System.out.println("Array após modificação com Lista: " + Arrays.toString(MetodosArray.getNomesArray()));
        } catch (NomeNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
