package ejercicioLigaFutbol;

public class Jugador {
	private String nombre;
	private int dorsal;
	private String demarcacion;
	private int goles;
	private String apodo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", goles=" + goles
				+ ", apodo=" + apodo + "]";
	}

	public Jugador(String nombre, int dorsal, String demarcacion, int goles, String apodo) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
		this.goles = goles;
		this.apodo = apodo;
	}

}
