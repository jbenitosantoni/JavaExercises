package ejercioDiscografica;

public class Cancion {
	private String titulo;
	private double duracion;

	public Cancion() {

	}

	public Cancion(String titulo, double duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion; // en minutos
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", duracion=" + duracion + "]";
	}

	public void mostrarDatos() {
		if (this.titulo != null) {
			System.out.println("T�tulo: " + this.titulo);
		}
		System.out.println("Duraci�n: " + this.duracion);
	}

}
