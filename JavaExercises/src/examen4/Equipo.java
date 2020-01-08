package examen4;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private String ciudad;
	private int antiguedad;
	private String nombreEstadio;
	private int aforoEstadio;
	private double presupuesto;
	private ArrayList<Jugador> jugadores;
	private Entrenador entrenador;

	public Equipo(String nombre, String ciudad, int antiguedad, String nombreEstadio, int aforoEstadio,
			double presupuesto, ArrayList<Jugador> jugadores, Entrenador entrenador) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.antiguedad = antiguedad;
		this.nombreEstadio = nombreEstadio;
		this.aforoEstadio = aforoEstadio;
		this.presupuesto = presupuesto;
		this.entrenador = entrenador;
		this.jugadores = jugadores;
	}

	public Equipo() {
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

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getNombreEstadio() {
		return nombreEstadio;
	}

	public void setNombreEstadio(String nombreEstadio) {
		this.nombreEstadio = nombreEstadio;
	}

	public int getAforoEstadio() {
		return aforoEstadio;
	}

	public void setAforoEstadio(int aforoEstadio) {
		this.aforoEstadio = aforoEstadio;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", antiguedad=" + antiguedad + ", nombreEstadio="
				+ nombreEstadio + ", aforoEstadio=" + aforoEstadio + ", presupuesto=" + presupuesto + ", jugadores="
				+ jugadores + ", entrenador=" + entrenador + "]";
	}

}
