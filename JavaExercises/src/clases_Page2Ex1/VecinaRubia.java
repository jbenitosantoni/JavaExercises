package clases_Page2Ex1;

public class VecinaRubia {
	private String nombre;
	private String apellidos;
	private int nivel_brillibrilli;
	private double longitud_melena;
	private int n_heaters;
	private int n_followers;

	public VecinaRubia(String nombre, String apellidos, int nivel_brillibrilli, double longitud_melena, int n_heaters,
			int n_followers) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nivel_brillibrilli = nivel_brillibrilli;
		this.longitud_melena = longitud_melena;
		this.n_heaters = n_heaters;
		this.n_followers = n_followers;
	}

	public VecinaRubia() {
		super();
	}

	public VecinaRubia(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

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

	public int getNivel_brillibrilli() {
		return nivel_brillibrilli;
	}

	public void setNivel_brillibrilli(int nivel_brillibrilli) {
		this.nivel_brillibrilli = nivel_brillibrilli;
	}

	public double getLongitud_melena() {
		return longitud_melena;
	}

	public void setLongitud_melena(double longitud_melena) {
		this.longitud_melena = longitud_melena;
	}

	public int getN_heaters() {
		return n_heaters;
	}

	public void setN_heaters(int n_heaters) {
		this.n_heaters = n_heaters;
	}

	public int getN_followers() {
		return n_followers;
	}

	public void setN_followers(int n_followers) {
		this.n_followers = n_followers;
	}

	@Override
	public String toString() {
		return "VecinaRubia: nombre=" + nombre + ", apellidos=" + apellidos + ", nivel_brillibrilli="
				+ nivel_brillibrilli + ", longitud_melena=" + longitud_melena + ", n_heaters=" + n_heaters
				+ ", n_followers=" + n_followers;
	}

}
