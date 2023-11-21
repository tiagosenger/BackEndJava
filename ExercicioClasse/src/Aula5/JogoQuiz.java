package Aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class JogoQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pergunta> perguntas = new ArrayList<>();
        perguntas.add(new Pergunta("Qual é a capital do Brasil?", new String[]{"Brasília", "Rio de Janeiro", "São Paulo", "Belo Horizonte"}, 1));
        perguntas.add(new Pergunta("Qual é o maior planeta do sistema solar?", new String[]{"Vênus", "Marte", "Júpiter", "Saturno"}, 3));
        perguntas.add(new Pergunta("Quem escreveu 'Dom Quixote'?", new String[]{"Machado de Assis", "Cervantes", "Shakespeare", "Dostoiévski"}, 2));

        int pontuacao = 0;
        for (Pergunta pergunta : perguntas) {
            pergunta.exibirPergunta();
            System.out.print("Escolha a alternativa correta (1 a 4): ");
            int respostaUsuario = scanner.nextInt();

            if (pergunta.verificarResposta(respostaUsuario)) {
                System.out.println("Resposta correta!\n");
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta. A alternativa correta era: " + pergunta.getAlternativaCorreta() + "\n");
            }
        }

        System.out.println("Pontuação final: " + pontuacao + " de " + perguntas.size());

        scanner.close();
    }
}

class Pergunta {
    private String texto;
    private String[] alternativas;
    private int alternativaCorreta;

    public Pergunta(String texto, String[] alternativas, int alternativaCorreta) {
        this.texto = texto;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    public void exibirPergunta() {
        System.out.println(texto);
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println((i + 1) + ". " + alternativas[i]);
        }
    }

    public boolean verificarResposta(int respostaUsuario) {
        return respostaUsuario == alternativaCorreta;
    }

    public int getAlternativaCorreta() {
        return alternativaCorreta;
    }
}

