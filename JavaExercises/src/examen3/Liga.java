package examen3;

import java.util.Arrays;

public class Liga {
	private String nombre;
	private String pais;
	private Equipo[] equipos;

	public Liga(String nombre, String pais, Equipo[] equipos) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.equipos = equipos;
	}

	public Liga() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Equipo[] getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "Liga [nombre=" + nombre + ", pais=" + pais + ", equipos=" + Arrays.toString(equipos) + "]";
	}

}
