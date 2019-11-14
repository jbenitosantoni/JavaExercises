package clases_controlador_aereo_cambiosprofe;

public class Controlador {
	private String nombre;
	private String apellidos;
	private String dni;
	private int nacimiento;
	private int anosexp;
	private int destreza;

	public Controlador() {

	}

	public Controlador(String nombre, String apellidos, String dni, int nacimiento, int anosexp, int destreza) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.nacimiento = nacimiento;
		this.anosexp = anosexp;
		this.destreza = destreza;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}

	public int getAnosexp() {
		return anosexp;
	}

	public void setAnosexp(int anosexp) {
		this.anosexp = anosexp;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public String mostrarDatos() {
		return "Controlador [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", nacimiento="
				+ nacimiento + ", anosexp=" + anosexp + ", destreza=" + destreza + "]";
	}
}
