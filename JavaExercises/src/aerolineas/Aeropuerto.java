package aerolineas;

import java.util.ArrayList;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private int codigo_aeropuerto;
	private ArrayList<Avion> aviones = new ArrayList<Avion>();

	public Aeropuerto(String nombre, String ciudad, int codigo_aeropuerto, ArrayList<Avion> aviones) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codigo_aeropuerto = codigo_aeropuerto;
		this.aviones = aviones;
	}

	public ArrayList<Avion> getAviones() {
		return aviones;
	}

	public void setAviones(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}

	public Aeropuerto() {
		super();
	}

	public Aeropuerto(int codigo_aeropuerto) {
		super();
		this.codigo_aeropuerto = codigo_aeropuerto;
	}

	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", ciudad=" + ciudad + ", codigo_aeropuerto=" + codigo_aeropuerto
				+ ", aviones=" + aviones + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCodigo_aeropuerto() {
		return codigo_aeropuerto;
	}

	public void setCodigo_aeropuerto(int codigo_aeropuerto) {
		this.codigo_aeropuerto = codigo_aeropuerto;
	}

	public String mostrarDatosCod(int numero) {
		if (this.codigo_aeropuerto < numero) {
			return "Aeropuerto [nombre=" + nombre + ", ciudad=" + ciudad + ", codigo_aeropuerto=" + codigo_aeropuerto
					+ "]";
		} else {
			return "No hay ninguno menor al codigo introducido";
		}
	}
}
