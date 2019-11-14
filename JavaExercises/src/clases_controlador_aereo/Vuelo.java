package clases_controlador_aereo;

public class Vuelo {
	private int n_vuelo;
	private String ciudad;
	private double precio;

	public Vuelo(int n_vuelo, String ciudad, double precio) {
		super();
		this.n_vuelo = n_vuelo;
		this.ciudad = ciudad;
		this.precio = precio;
	}

	public int getN_vuelo() {
		return n_vuelo;
	}

	public void setN_vuelo(int n_vuelo) {
		this.n_vuelo = n_vuelo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vuelo [n_vuelo=" + n_vuelo + ", ciudad=" + ciudad + ", precio=" + precio + "]";
	}

}
