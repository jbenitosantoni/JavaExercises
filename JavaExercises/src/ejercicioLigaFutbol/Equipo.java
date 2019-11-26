package ejercicioLigaFutbol;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private String ciudad;
	private String estadio;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

	public Equipo(String nombre, String ciudad, String estadio) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.estadio = estadio;
	}

	public Equipo(String nombre, String ciudad, String estadio, ArrayList<Jugador> jugadores) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.estadio = estadio;
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", estadio=" + estadio + ", jugadores=" + jugadores
				+ "]";
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

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}
