package clases_controlador_aereo_cambiosprofe;

public class Aerolinea {
	private String nombre;
	private String p_origen;

	public Aerolinea() {

	}

	public Aerolinea(String nombre, String p_origen) {
		super();
		this.nombre = nombre;
		this.p_origen = p_origen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getP_origen() {
		return p_origen;
	}

	public void setP_origen(String p_origen) {
		this.p_origen = p_origen;
	}

	public String mostrarDatos() {
		return "Aerolinea: " + nombre + ", Pa�s de Origen: " + p_origen;
	}
}
