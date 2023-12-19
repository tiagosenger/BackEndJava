package exercicioArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosArray {
	private static String[] nomesArray = {"Carol", "Degas", "Tiago", "Paulo", "Helder"};
	
    public static String[] getNomesArray() {
		return nomesArray;
	}

	public static void setNomesArray(String[] nomesArray) {
		MetodosArray.nomesArray = nomesArray;
	}

	public static boolean verificarNomeArray(String nome) {
        for (String n : nomesArray) {
            if (n.equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificarNomeLista(String nome) {
        List<String> nomesLista = Arrays.asList(nomesArray);
        return nomesLista.contains(nome);
    }

    public static void modificarNomeArray(String nomeAntigo, String novoNome) throws NomeNaoEncontradoException {
        boolean encontrado = false;
        for (int i = 0; i < nomesArray.length; i++) {
            if (nomesArray[i].equals(nomeAntigo)) {
                nomesArray[i] = novoNome;
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            throw new NomeNaoEncontradoException("Nome não encontrado no array.");
        }
    }

    public static void modificarNomeLista(String nomeAntigo, String novoNome) throws NomeNaoEncontradoException {
        List<String> nomesLista = new ArrayList<>(Arrays.asList(nomesArray));

        if (nomesLista.contains(nomeAntigo)) {
            int index = nomesLista.indexOf(nomeAntigo);
            nomesLista.set(index, novoNome);
            nomesArray = nomesLista.toArray(new String[0]);
        } else {
            throw new NomeNaoEncontradoException("Nome não encontrado na lista.");
        }
    }

    public static class NomeNaoEncontradoException extends Exception {
    	private static final long serialVersionUID = 1L;
    	public NomeNaoEncontradoException(String message) {
        	super(message);
    	}
    }    
}
