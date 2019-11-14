package clases_controlador_aereo;

public class Avion {
	private String marca;
	private String modelo;
	private double capacidad_deposito;
	private int capacidad_pasajeros;
	private String matricula;

	@Override
	public String toString() {
		return "Avion [marca=" + marca + ", modelo=" + modelo + ", capacidad_deposito=" + capacidad_deposito
				+ ", capacidad_pasajeros=" + capacidad_pasajeros + ", matricula=" + matricula + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapacidad_deposito() {
		return capacidad_deposito;
	}

	public void setCapacidad_deposito(double capacidad_deposito) {
		this.capacidad_deposito = capacidad_deposito;
	}

	public int getCapacidad_pasajeros() {
		return capacidad_pasajeros;
	}

	public void setCapacidad_pasajeros(int capacidad_pasajeros) {
		this.capacidad_pasajeros = capacidad_pasajeros;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Avion(String marca, String modelo, double capacidad_deposito, int capacidad_pasajeros, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad_deposito = capacidad_deposito;
		this.capacidad_pasajeros = capacidad_pasajeros;
		this.matricula = matricula;
	}

}
