package Aula6e7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private Date dataNascimento;

    public Cliente(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        try {
            dataNascimento = formatador.parse(dataNascimentoStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        scanner.close();
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + formatarData(dataNascimento));
    }

    public int calcularIdade() {
        Date dataAtual = new Date();
        long diferencaEmMillis = dataAtual.getTime() - dataNascimento.getTime();
        long diferencaEmDias = diferencaEmMillis / (24 * 60 * 60 * 1000);
        int idade = (int) (diferencaEmDias / 365.25);
        return idade;
    }

    private String formatarData(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(data);
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("", null);
        cliente.lerDados();
        cliente.mostrarDados();
        System.out.println("Idade: " + cliente.calcularIdade() + " anos");
    }
}
