package clases_Ejercicio_Clase_2;

public class Mvp {
	private String nombre;
	private String dorsal;
	private String equipo;
	private int goles;
	private int asistencias;
	private int faltas;
	private int pasesClave;
	private String jornada;
	private String temporada;

	public Mvp(String nombre, String dorsal, String equipo, int goles, int asistencias, int faltas, int pasesClave,
			String jornada, String temporada) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
		this.goles = goles;
		this.asistencias = asistencias;
		this.faltas = faltas;
		this.pasesClave = pasesClave;
		this.jornada = jornada;
		this.temporada = temporada;
	}

	public Mvp() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDorsal() {
		return dorsal;
	}

	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public int getPasesClave() {
		return pasesClave;
	}

	public void setPasesClave(int pasesClave) {
		this.pasesClave = pasesClave;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public double dameEficiencia() {
		double efi = 0;
		efi = goles + (asistencias / 2) + pasesClave + faltas;
		return efi;
	}

	public String toString() {
		return "nombre=" + nombre + ", dorsal=" + dorsal + ", equipo=" + equipo + ", goles=" + goles + ", asistencias="
				+ asistencias + ", faltas=" + faltas + ", pasesClave=" + pasesClave + ", jornada=" + jornada
				+ ", temporada=" + temporada;
	}
}