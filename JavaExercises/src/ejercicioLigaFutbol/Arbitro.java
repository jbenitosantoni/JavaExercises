package ejercicioLigaFutbol;

public class Arbitro {
	private String Nombre;
	private String dni;
	private int n_Colegiado;
	private int n_Internacional;
	private int n_Arbitrados;

	public Arbitro(String nombre, String dni, int n_Colegiado, int n_Internacional, int n_Arbitrados) {
		super();
		Nombre = nombre;
		this.dni = dni;
		this.n_Colegiado = n_Colegiado;
		this.n_Internacional = n_Internacional;
		this.n_Arbitrados = n_Arbitrados;
	}

	@Override
	public String toString() {
		return "Arbitro [Nombre=" + Nombre + ", dni=" + dni + ", n_Colegiado=" + n_Colegiado + ", n_Internacional="
				+ n_Internacional + ", n_Arbitrados=" + n_Arbitrados + "]";
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getN_Colegiado() {
		return n_Colegiado;
	}

	public void setN_Colegiado(int n_Colegiado) {
		this.n_Colegiado = n_Colegiado;
	}

	public int getN_Internacional() {
		return n_Internacional;
	}

	public void setN_Internacional(int n_Internacional) {
		this.n_Internacional = n_Internacional;
	}

	public int getN_Arbitrados() {
		return n_Arbitrados;
	}

	public void setN_Arbitrados(int n_Arbitrados) {
		this.n_Arbitrados = n_Arbitrados;
	}

}
