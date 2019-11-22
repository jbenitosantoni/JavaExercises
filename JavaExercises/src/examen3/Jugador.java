package examen3;

public class Jugador {
	private String nombre;
	private String apellidos;
	private String numeroLicencia;
	private String nacionalidad;
	private int edad;
	private int altura;
	private int peso;

	public Jugador() {

	}

	public Jugador(String nombre, String apellidos, String dni, String nacionalidad, int edad, int altura, int peso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroLicencia = dni;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
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

	public String getnumeroLicencia() {
		return numeroLicencia;
	}

	public void setnumeroLicencia(String dni) {
		this.numeroLicencia = dni;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + numeroLicencia + ", nacionalidad="
				+ nacionalidad + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + "]";
	}

}
