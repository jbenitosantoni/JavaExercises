package aerolineas;

public class Pasajero {
	private String nombre;
	private String apellidos;
	private int telefono;
	private String dni;
	private int edad;

	public Pasajero() {
		super();
	}

	public Pasajero(String nombre, String apellidos, int telefono, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
		this.edad = edad;
	}

	public Pasajero(String dni) {
		super();
		this.dni = dni;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
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

	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", dni=" + dni
				+ ", edad=" + edad + "]";
	}

	public Boolean mayorEdad() {
		if (edad >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public void sumaEdad(int edad) {
		this.edad = edad + this.edad;
	}

	public String nombreSiMayorEdad(int edad) {
		if (this.edad > edad) {
			return nombre + " " + apellidos;
		} else {
			return "No es mayor de la edad introducida";
		}
	}
}
