package ficheros;

public class Animal_Salvaje {
	private int id_animal;
	private double altura;
	private double peso;
	private int edad;
	private String nombre;
	private String especie;
	private int nivel_fuerza;

	public int getId_animal() {
		return id_animal;
	}

	public void setId_animal(int id_animal) {
		this.id_animal = id_animal;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getNivel_fuerza() {
		return nivel_fuerza;
	}

	public void setNivel_fuerza(int nivel_fuerza) {
		this.nivel_fuerza = nivel_fuerza;
	}

	@Override
	public String toString() {
		return "Animal_Salvaje [id_animal=" + id_animal + ", altura=" + altura + ", peso=" + peso + ", edad=" + edad
				+ ", nombre=" + nombre + ", especie=" + especie + ", nivel_fuerza=" + nivel_fuerza + "]";
	}

	public Animal_Salvaje(int id_animal, double altura, double peso, int edad, String nombre, String especie,
			int nivel_fuerza) {
		super();
		this.id_animal = id_animal;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
		this.nombre = nombre;
		this.especie = especie;
		this.nivel_fuerza = nivel_fuerza;
	}
}
