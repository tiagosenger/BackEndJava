package PO05;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class EmpresaOnibus {
    private List<Veiculo> veiculos;
    private List<Motorista> motoristas;
    private List<Cobrador> cobradores;
    private List<Passageiro> passageiros;
    private List<PontoDeParada> pontosDeParada;
    private List<Trajeto> trajetos;
    private List<Jornada> jornadas;
    
    public EmpresaOnibus() {
        veiculos = new ArrayList<>();
        motoristas = new ArrayList<>();
        cobradores = new ArrayList<>();
        passageiros = new ArrayList<>();
        pontosDeParada = new ArrayList<>();
        trajetos = new ArrayList<>();
        jornadas = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void cadastrarMotorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public void cadastrarCobrador(Cobrador cobrador) {
        cobradores.add(cobrador);
    }

    public void cadastrarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void cadastrarPontoDeParada(PontoDeParada pontoDeParada) {
        pontosDeParada.add(pontoDeParada);
    }

    public void cadastrarTrajeto(Trajeto trajeto) {
        trajetos.add(trajeto);
    }
    
    public void registrarJornada(Jornada jornada) {
        jornadas.add(jornada);
    }

    public void registrarInicioTrajeto(Jornada jornada, Date dataHora) {
        if (jornada != null) {
            Veiculo veiculo = jornada.getVeiculo();
            if (veiculo != null) {
                veiculo.estacionar(jornada, dataHora);
            } else {
                System.out.println("Erro: Jornada sem veículo associado.");
            }
        } else {
            System.out.println("Erro: Jornada não especificada para registrar início de trajeto.");
        }
    }

    public void registrarPassageiroEmbarcado(Passageiro passageiro, PontoDeParada pontoDeParada) {
        for (Jornada jornada : jornadas) {
            Veiculo veiculo = jornada.getVeiculo();
            if (veiculo != null) {
                veiculo.embarcarPassageiroComCartao(passageiro, pontoDeParada);
            }
        }
    }

    public void registrarCheckpoint(Jornada jornada, PontoDeParada pontoDeParada, Date dataHora) {
        System.out.println("Checkpoint registrado na jornada de " + jornada.getMotorista().getNome() +
                " no ponto " + pontoDeParada.getNome() + " em " + dataHora);
    }
}