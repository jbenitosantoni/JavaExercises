package clases_Page2Ex1;

public class CazurroLeones {
	private String nombre;
	private String apellidos;
	private int nivel_cazurrismo;
	private double altura;
	private double peso;
	private int capacidad_alcoholica;
	private int n_haters;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getNivel_cazurrismo() {
		return nivel_cazurrismo;
	}

	public void setNivel_cazurrismo(int nivel_cazurrismo) {
		this.nivel_cazurrismo = nivel_cazurrismo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getCapacidad_alcoholica() {
		return capacidad_alcoholica;
	}

	public void setCapacidad_alcoholica(int capacidad_alcoholica) {
		this.capacidad_alcoholica = capacidad_alcoholica;
	}

	public int getN_haters() {
		return n_haters;
	}

	public void setN_haters(int n_haters) {
		this.n_haters = n_haters;
	}

	public CazurroLeones(String nombre, String apellidos, int nivel_cazurrismo, double altura, double peso,
			int capacidad_alcoholica, int n_haters) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nivel_cazurrismo = nivel_cazurrismo;
		this.altura = altura;
		this.peso = peso;
		this.capacidad_alcoholica = capacidad_alcoholica;
		this.n_haters = n_haters;
	}

	public CazurroLeones() {
		super();
	}

	public CazurroLeones(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "CazurroLeones: nombre=" + nombre + ", apellidos=" + apellidos + ", nivel_cazurrismo=" + nivel_cazurrismo
				+ ", altura=" + altura + ", peso=" + peso + ", capacidad_alcoholica=" + capacidad_alcoholica
				+ ", n_haters=" + n_haters;
	}
}
