package PO05;

import java.util.Date;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private boolean eletrico;

    public Veiculo(String placa, String modelo, int anoFabricacao, boolean eletrico) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.eletrico = eletrico;
    }

    public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public boolean isEletrico() {
		return eletrico;
	}


	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}


    public void estacionar(Jornada jornada, Date dataHora) {
        if (jornada != null) {
            System.out.println("Veículo estacionado na jornada de " + jornada.getMotorista().getNome() +
                    " em " + dataHora);
        } else {
            System.out.println("Erro: Jornada não especificada para estacionar o veículo.");
        }
    }
    
    public void embarcarPassageiroComCartao(Passageiro passageiro, PontoDeParada pontoDeParada) {
        if (pontoDeParada != null) {
            passageiro.embarcarComCartao(pontoDeParada);
        } else {
            System.out.println("Erro: Ponto de parada não especificado para embarcar o passageiro.");
        }
    }
}
