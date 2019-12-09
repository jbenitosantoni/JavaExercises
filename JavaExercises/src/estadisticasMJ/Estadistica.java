package estadisticasMJ;

public class Estadistica {
	private String temporada;
	private double puntospartido;
	private double robospartido;
	private double asistentciaspartido;
	private double rebotespartido;

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public double getPuntospartido() {
		return puntospartido;
	}

	public void setPuntospartido(double puntospartido) {
		this.puntospartido = puntospartido;
	}

	public double getRobospartido() {
		return robospartido;
	}

	public void setRobospartido(double robospartido) {
		this.robospartido = robospartido;
	}

	public double getAsistentciaspartido() {
		return asistentciaspartido;
	}

	public void setAsistentciaspartido(double asistentciaspartido) {
		this.asistentciaspartido = asistentciaspartido;
	}

	public double getRebotespartido() {
		return rebotespartido;
	}

	public void setRebotespartido(double rebotespartido) {
		this.rebotespartido = rebotespartido;
	}

	public Estadistica(String temporada, double puntospartido, double robospartido, double asistentciaspartido,
			double rebotespartido) {
		super();
		this.temporada = temporada;
		this.puntospartido = puntospartido;
		this.robospartido = robospartido;
		this.asistentciaspartido = asistentciaspartido;
		this.rebotespartido = rebotespartido;
	}

	public Estadistica() {
		super();
	}

	@Override
	public String toString() {
		return "Estadistica [temporada=" + temporada + ", puntospartido=" + puntospartido + ", robospartido="
				+ robospartido + ", asistentciaspartido=" + asistentciaspartido + ", rebotespartido=" + rebotespartido
				+ "]";
	}

}
