package PO04;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static float somar(float a, float b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static float subtrair(float a, float b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static float dividir(float a, float b) {
        return a / b;
    }

    public static int somarLista(List<Integer> numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static float somarListaFloat(List<Float> numeros) {
        float resultado = 0;
        for (float numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static int multiplicarLista(List<Integer> numeros) {
        int resultado = 1;
        for (int numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

    public static float multiplicarListaFloat(List<Float> numeros) {
        float resultado = 1;
        for (float numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int resultadoInt = somar(5, 3);
        System.out.println("Soma (int): " + resultadoInt);

        float resultadoFloat = somar(5.0f, 3.5f);
        System.out.println("Soma (float): " + resultadoFloat);

        resultadoInt = multiplicar(4, 2);
        System.out.println("Multiplicação (int): " + resultadoInt);

        resultadoFloat = dividir(8.0f, 2.0f);
        System.out.println("Divisão (float): " + resultadoFloat);

        List<Integer> numerosInt = new ArrayList<>();
        numerosInt.add(2);
        numerosInt.add(3);
        numerosInt.add(4);

        resultadoInt = somarLista(numerosInt);
        System.out.println("Soma da lista (int): " + resultadoInt);

        List<Float> numerosFloat = new ArrayList<>();
        numerosFloat.add(2.5f);
        numerosFloat.add(3.5f);
        numerosFloat.add(1.5f);

        resultadoFloat = multiplicarListaFloat(numerosFloat);
        System.out.println("Multiplicação da lista (float): " + resultadoFloat);
    }
}

