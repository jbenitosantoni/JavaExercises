package examen3;

public class Arbitro {
	private String nombre;
	private String apellidos;
	private String dni;
	private String nacionalidad;
	private int experiencia;
	private int nivel;

	public Arbitro() {

	}

	public Arbitro(String nombre, String apellidos, String dni, String nacionalidad, int experiencia, int nivel) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.nacionalidad = nacionalidad;
		this.experiencia = experiencia;
		this.nivel = nivel;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		if (experiencia >= 0 && experiencia <= 10) {
			this.experiencia = experiencia;
		} else {
			System.out.println("Experiencia no valida");
		}
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		if (nivel >= 0 && nivel <= 100) {
			this.nivel = nivel;
		} else {
			System.out.println("Nivel no valido");
		}
	}

	@Override
	public String toString() {
		return "Arbitro [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", nacionalidad="
				+ nacionalidad + ", experiencia=" + experiencia + ", nivel=" + nivel + "]";
	}

	public static double devolverPotencial(Arbitro[] arbitros, String dni) {
		Double potencial = 0.1;
		for (int i = 0; i < arbitros.length; i++) {
			if (arbitros[i].getDni().equalsIgnoreCase(dni)) {
				potencial = (arbitros[i].getExperiencia() + arbitros[i].getNivel()) / 0.6;
			}
		}
		return potencial;
	}

	// Ejercicio4
	public static double[] ejercicio4(Arbitro[] arbitros, String dni) {
		double devolver[] = new double[2];
		for (int i = 0; i < arbitros.length; i++) {
			if (arbitros[i].getDni().equalsIgnoreCase(dni)) {
				devolver[0] = arbitros[i].getExperiencia() * 5;
				devolver[1] = arbitros[i].getNivel() / 3;
			}
		}
		return devolver;
	}
	// Ejercicio5

}
