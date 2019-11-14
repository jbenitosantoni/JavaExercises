package clases_controlador_aereo_cambiosprofe;

public class Vuelo {
	private int n_vuelo;
	private String c_destino;
	private double precio;

	public Vuelo() {

	}

	public Vuelo(int n_vuelo, String c_destino, Double precio) {
		super();
		this.n_vuelo = n_vuelo;
		this.c_destino = c_destino;
		this.precio = precio;
	}

	public int getN_vuelo() {
		return n_vuelo;
	}

	public void setN_vuelo(int n_vuelo) {
		this.n_vuelo = n_vuelo;
	}

	public String getC_destino() {
		return c_destino;
	}

	public void setC_destino(String c_destino) {
		this.c_destino = c_destino;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String mostrarDatos() {
		return "Vuelo [n_vuelo=" + n_vuelo + ", c_destino=" + c_destino + ", precio=" + precio + "]";
	}

}
