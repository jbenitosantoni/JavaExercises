package ejercioDiscografica;

import java.util.ArrayList;

public class Disco {
	private String titulo;
	private int anoPublicacion;
	private int codigoDisco;
	private String productor;
	private ArrayList<Cancion> canciones;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	public int getCodigoDisco() {
		return codigoDisco;
	}

	public void setCodigoDisco(int codigoDisco) {
		this.codigoDisco = codigoDisco;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	@Override
	public String toString() {
		return "Disco [titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + ", codigoDisco=" + codigoDisco
				+ ", productor=" + productor + ", canciones=" + canciones + "]";
	}

	public Disco(String titulo, int anoPublicacion, int codigoDisco, String productor, ArrayList<Cancion> canciones) {
		super();
		this.titulo = titulo;
		this.anoPublicacion = anoPublicacion;
		this.codigoDisco = codigoDisco;
		this.productor = productor;
		this.canciones = canciones;
	}

}
