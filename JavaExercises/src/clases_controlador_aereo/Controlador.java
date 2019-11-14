package clases_controlador_aereo;

public class Controlador {
	private String nombre;
	private String apellidos;
	private String dni;
	private int año_nacimiento;
	private int año_experiencia;
	private int nivel;

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

	public int getAño_nacimiento() {
		return año_nacimiento;
	}

	public void setAño_nacimiento(int año_nacimiento) {
		this.año_nacimiento = año_nacimiento;
	}

	public int getAño_experiencia() {
		return año_experiencia;
	}

	public void setAño_experiencia(int año_experiencia) {
		this.año_experiencia = año_experiencia;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Controlador [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", año_nacimiento="
				+ año_nacimiento + ", año_experiencia=" + año_experiencia + ", nivel=" + nivel + "]";
	}

	public Controlador(String nombre, String apellidos, String dni, int año_nacimiento, int año_experiencia,
			int nivel) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.año_nacimiento = año_nacimiento;
		this.año_experiencia = año_experiencia;
		this.nivel = nivel;
	}

}
