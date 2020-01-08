package examen4;

import java.util.ArrayList;

public class Liga {
	private String nombre;
	private String pais;
	private String division;
	ArrayList<Equipo> equipos;

	public Liga(String nombre, String pais, String division, ArrayList<Equipo> equipos) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.division = division;
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

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "Liga [nombre=" + nombre + ", pais=" + pais + ", division=" + division + ", equipos=" + equipos + "]";
	}

}
