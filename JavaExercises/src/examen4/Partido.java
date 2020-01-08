package examen4;

public class Partido {
	private String fecha;
	private String ciudad;
	private String nombreEstadio;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private Arbitro arbi;

	public Partido(String fecha, String ciudad, String nombreEstadio, Equipo equipoLocal, Equipo equipoVisitante,
			int golesLocal, int golesVisitante, Arbitro arbi) {
		super();
		this.fecha = fecha;
		this.ciudad = ciudad;
		this.nombreEstadio = nombreEstadio;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.arbi = arbi;
	}

	public Partido() {
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombreEstadio() {
		return nombreEstadio;
	}

	public void setNombreEstadio(String nombreEstadio) {
		this.nombreEstadio = nombreEstadio;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public Arbitro getArbi() {
		return arbi;
	}

	public void setArbi(Arbitro arbi) {
		this.arbi = arbi;
	}

	@Override
	public String toString() {

		String devolver = "***** " + getFecha() + " - " + getCiudad() + " *****\n" + "\"" + getEquipoLocal().getNombre()
				+ "\" " + getGolesLocal() + " - " + getGolesVisitante() + " \"" + getEquipoVisitante().getNombre()
				+ "\"\n" + "*********************************";
		return devolver;
	}

}
