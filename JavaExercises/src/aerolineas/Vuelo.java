package aerolineas;

import java.util.ArrayList;

public class Vuelo {
	private int cod_vuelo;
	private Avion avion;
	private ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private Aeropuerto aeropuerto_salida;
	private Aeropuerto aeropuerto_llegada;

	public Vuelo(int cod_vuelo, Avion avion, ArrayList<Pasajero> pasajeros, Aeropuerto aeropuerto_salida,
			Aeropuerto aeropuerto_llegada) {
		super();
		this.cod_vuelo = cod_vuelo;
		this.avion = avion;
		this.pasajeros = pasajeros;
		this.aeropuerto_salida = aeropuerto_salida;
		this.aeropuerto_llegada = aeropuerto_llegada;
	}

	public Vuelo() {
		super();
	}

	public Vuelo(int cod_vuelo) {
		super();
		this.cod_vuelo = cod_vuelo;
	}

	@Override
	public String toString() {
		String depasajeros = "";
		for (int i = 0; i < pasajeros.size(); i++) {
			depasajeros = depasajeros + " " + pasajeros.get(i).getNombre() + " " + pasajeros.get(i).getApellidos()
					+ ",";
		}
		return "***************\n" + "Vuelo: " + cod_vuelo + "\nAeropuerto Salida: " + aeropuerto_salida.getNombre()
				+ "\nAeropuerto Llegada: " + aeropuerto_llegada.getNombre() + "\nListado Pasajeros:" + depasajeros
				+ "\n***************";
	}

	public int getCod_vuelo() {
		return cod_vuelo;
	}

	public void setCod_vuelo(int cod_vuelo) {
		this.cod_vuelo = cod_vuelo;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Aeropuerto getAeropuerto_salida() {
		return aeropuerto_salida;
	}

	public void setAeropuerto_salida(Aeropuerto aeropuerto_salida) {
		this.aeropuerto_salida = aeropuerto_salida;
	}

	public Aeropuerto getAeropuerto_llegada() {
		return aeropuerto_llegada;
	}

	public void setAeropuerto_llegada(Aeropuerto aeropuerto_llegada) {
		this.aeropuerto_llegada = aeropuerto_llegada;
	}

}
