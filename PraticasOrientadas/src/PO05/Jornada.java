package PO05;

import java.util.Date;

public class Jornada {
    private Motorista motorista;
    private Cobrador cobrador;
    private Veiculo veiculo;
    private Trajeto trajeto;
    private Date inicio;
    private Date fim;

    public Jornada(Motorista motorista, Cobrador cobrador, Veiculo veiculo, Trajeto trajeto, Date inicio, Date fim) {
        this.motorista = motorista;
        this.cobrador = cobrador;
        this.veiculo = veiculo;
        this.trajeto = trajeto;
        this.inicio = inicio;
        this.fim = fim;
    }

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Cobrador getCobrador() {
		return cobrador;
	}

	public void setCobrador(Cobrador cobrador) {
		this.cobrador = cobrador;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Trajeto getTrajeto() {
		return trajeto;
	}

	public void setTrajeto(Trajeto trajeto) {
		this.trajeto = trajeto;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}
}