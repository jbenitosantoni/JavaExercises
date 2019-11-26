package ejercicioLigaFutbol;

public class Partido {
	private String fecha;
	private String hora;
	private Equipo equipolocal;
	private Equipo equipovisitante;
	private int goleslocal;
	private int golesvisitante;

	public Partido(String fecha, String hora, Equipo equipolocal, Equipo equipovisitante, int goleslocal,
			int golesvisitante) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.equipolocal = equipolocal;
		this.equipovisitante = equipovisitante;
		this.goleslocal = goleslocal;
		this.golesvisitante = golesvisitante;
	}

	@Override
	public String toString() {
		return "Partido [fecha=" + fecha + ", hora=" + hora + ", equipolocal=" + equipolocal + ", equipovisitante="
				+ equipovisitante + ", goleslocal=" + goleslocal + ", golesvisitante=" + golesvisitante + "]";
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Equipo getEquipolocal() {
		return equipolocal;
	}

	public void setEquipolocal(Equipo equipolocal) {
		this.equipolocal = equipolocal;
	}

	public Equipo getEquipovisitante() {
		return equipovisitante;
	}

	public void setEquipovisitante(Equipo equipovisitante) {
		this.equipovisitante = equipovisitante;
	}

	public int getGoleslocal() {
		return goleslocal;
	}

	public void setGoleslocal(int goleslocal) {
		this.goleslocal = goleslocal;
	}

	public int getGolesvisitante() {
		return golesvisitante;
	}

	public void setGolesvisitante(int golesvisitante) {
		this.golesvisitante = golesvisitante;
	}

}
