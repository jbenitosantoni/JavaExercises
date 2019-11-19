package clases_controlador_aereo_5;

public class Avion {
	@Override
	public String toString() {
		return "Avion [marca=" + marca + ", modelo=" + modelo + ", cap_deposito=" + cap_deposito + ", cap_pasajeros="
				+ cap_pasajeros + ", matricula=" + matricula + "]";
	}

	private String marca;
	private String modelo;
	private int cap_deposito;
	private int cap_pasajeros;
	private String matricula;

	public Avion() {

	}

	public Avion(String marca, String modelo, int cap_deposito, int cap_pasajeros, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cap_deposito = cap_deposito;
		this.cap_pasajeros = cap_pasajeros;
		this.matricula = matricula;
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

	public int getCap_deposito() {
		return cap_deposito;
	}

	public void setCap_deposito(int cap_deposito) {
		this.cap_deposito = cap_deposito;
	}

	public int getCap_pasajeros() {
		return cap_pasajeros;
	}

	public void setCap_pasajeros(int cap_pasajeros) {
		this.cap_pasajeros = cap_pasajeros;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String mostrarDatos() {
		return "Avi�n [marca=" + marca + ", modelo=" + modelo + ", cap_deposito=" + cap_deposito + ", cap_pasajeros="
				+ cap_pasajeros + ", matricula=" + matricula + "]";
	}

}
