package aerolineas;

public class Comandante {
	private String nombre;
	private String apellidos;
	private int telefono;
	private String dni;
	private int edad;
	private int rango;

	public Comandante(String nombre, String apellidos, int telefono, String dni, int edad, int rango) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
		this.edad = edad;
		this.rango = rango;
	}

	public Comandante() {
		super();
	}

	public Comandante(String dni) {
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

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	@Override
	public String toString() {
		return "Comandante [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", dni=" + dni
				+ ", edad=" + edad + ", rango=" + rango + "]";
	}

	public String condicionComandante(int rango) {
		if (this.rango > rango) {
			return nombre + " " + apellidos;
		} else {
			return "El rango es menor";
		}
	}

}
