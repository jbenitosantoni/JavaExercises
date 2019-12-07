package aerolineas;

public class Avion {
	private String modelo;
	private int pasajeros;
	private String matricula;
	private double capacidad_deposito;
	private int año;
	private String comandante;

	public Avion(String modelo, int pasajeros, String matricula, double capacidad_deposito, int año,
			String comandante) {
		super();
		this.modelo = modelo;
		this.pasajeros = pasajeros;
		this.matricula = matricula;
		this.capacidad_deposito = capacidad_deposito;
		this.año = año;
		this.comandante = comandante;
	}

	public Avion() {
		super();
	}

	public Avion(String matricula) {
		super();
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getCapacidad_deposito() {
		return capacidad_deposito;
	}

	public void setCapacidad_deposito(double capacidad_deposito) {
		this.capacidad_deposito = capacidad_deposito;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getComandante() {
		return comandante;
	}

	public void setComandante(String comandante) {
		this.comandante = comandante;
	}

	@Override
	public String toString() {
		return "Avion [modelo=" + modelo + ", pasajeros=" + pasajeros + ", matricula=" + matricula
				+ ", capacidad_deposito=" + capacidad_deposito + ", año=" + año + ", comandante=" + comandante + "]";
	}

}
