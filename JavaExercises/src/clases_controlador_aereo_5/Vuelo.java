package clases_controlador_aereo_5;

import java.util.Arrays;

public class Vuelo {
	private int n_vuelo;
	private String c_destino;
	private double precio;
	private String pasajeros[] = new String[2];

	@Override
	public String toString() {
		return "Vuelo [n_vuelo=" + n_vuelo + ", c_destino=" + c_destino + ", precio=" + precio + ", pasajeros="
				+ Arrays.toString(pasajeros) + "]";
	}

	public Vuelo(int n_vuelo, String c_destino, double precio, String[] pasajeros) {
		super();
		this.n_vuelo = n_vuelo;
		this.c_destino = c_destino;
		this.precio = precio;
		this.pasajeros = pasajeros;
	}

	public int getN_vuelo() {
		return n_vuelo;
	}

	public void setN_vuelo(int n_vuelo) {
		this.n_vuelo = n_vuelo;
	}

	public String getC_destino() {
		return c_destino;
	}

	public void setC_destino(String c_destino) {
		this.c_destino = c_destino;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String[] getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(String[] pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String mostrarDatos() {
		return "Vuelo [n_vuelo=" + n_vuelo + ", c_destino=" + c_destino + ", precio=" + precio + ", pasajeros="
				+ Arrays.toString(pasajeros) + "]";
	}

}