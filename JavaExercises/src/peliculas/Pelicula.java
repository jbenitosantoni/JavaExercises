package peliculas;

public class Pelicula {
	private int codigo;
	private String nombre;
	private int año;
	private String actor;
	private int coste;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public Pelicula(int codigo, String nombre, int año, String actor, int coste) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.año = año;
		this.actor = actor;
		this.coste = coste;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", año=" + año + ", actor=" + actor + ", coste="
				+ coste + "]";
	}

}