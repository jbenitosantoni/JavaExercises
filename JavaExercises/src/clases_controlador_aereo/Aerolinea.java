package clases_controlador_aereo;

public class Aerolinea {
	private String nombre;
	private String pais;

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

	@Override
	public String toString() {
		return "Aerolinea [nombre=" + nombre + ", pais=" + pais + "]";
	}

	public Aerolinea(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}

}
