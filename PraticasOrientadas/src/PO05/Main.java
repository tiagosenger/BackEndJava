package PO05;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmpresaOnibus empresa = new EmpresaOnibus();
        Motorista motorista = new Motorista("Degas", "123456789");
        Veiculo veiculo = new Veiculo("ABC1234", "Modelo", 2022, false);
        Trajeto trajeto = new Trajeto("Cidade Nova - Conquista");
        Jornada jornada = new Jornada(motorista, null, veiculo, trajeto, new Date(), new Date());
        empresa.registrarJornada(jornada);

        empresa.registrarInicioTrajeto(jornada, new Date());

        Passageiro passageiro = new Passageiro("Tiago", "12345");

        PontoDeParada pontoDeParada = new PontoDeParada("Ponto A");
        empresa.registrarPassageiroEmbarcado(passageiro, pontoDeParada);

        empresa.registrarCheckpoint(jornada, pontoDeParada, new Date());
    }
}

