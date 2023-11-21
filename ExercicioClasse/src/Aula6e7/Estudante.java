package Aula6e7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Estudante {
    private String nome;
    private Date dataNascimento;
    private String cpf;

    public Estudante(String nome, Date dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public void mostrarNome() {
        System.out.println("Nome: " + nome);
    }

    public void mostrarDataNascimento() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data e hora de nascimento: " + formatador.format(dataNascimento));
    }

    public void mostrarCPF() {
        System.out.println("CPF: " + cpf);
    }

    public static void main(String[] args) {

        Date dataNascimento = new Date();
        Estudante estudante = new Estudante("João", dataNascimento, "123.456.789-00");

        estudante.mostrarNome();
        estudante.mostrarDataNascimento();
        estudante.mostrarCPF();
    }
}
