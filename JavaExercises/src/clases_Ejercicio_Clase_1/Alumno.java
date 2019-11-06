package clases_Ejercicio_Clase_1;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String n_expediente;
	private String dni;
	private int edad;
	private double nota;

	Alumno() {

	}

	Alumno(String nombre, String apellidos, String n_expediente, String dni, int edad, double nota) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.n_expediente = n_expediente;
		this.dni = dni;
		this.edad = edad;
		this.nota = nota;
	}

	Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getN_expediente() {
		return n_expediente;
	}

	public void setN_expediente(String n_expediente) {
		this.n_expediente = n_expediente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre + " - Apellidos: " + this.apellidos + " - Expediente: "
				+ this.n_expediente + " - DNI: " + this.dni + " - Edad: " + this.edad + " - Nota: " + this.nota);
	}

	public boolean aprobado() {
		if (this.nota >= 7) {
			return true;
		} else {
			return false;
		}
	}
}