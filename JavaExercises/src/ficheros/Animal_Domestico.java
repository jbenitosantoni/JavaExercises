package ficheros;

public class Animal_Domestico implements Comparable<Animal_Domestico> {
	private int id_animal;
	private double altura;
	private double peso;
	private int edad;
	private String nombre;
	private String especie;
	private boolean mimoso;
	private String sonido_que_emite;
	private String propietario;

	public Animal_Domestico(int id_animal, double altura, double peso, int edad, String nombre, String especie,
			boolean mimoso, String sonido_que_emite, String propietario) {
		this.id_animal = id_animal;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
		this.nombre = nombre;
		this.especie = especie;
		this.mimoso = mimoso;
		this.sonido_que_emite = sonido_que_emite;
		this.propietario = propietario;
	}

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

	public boolean isMimoso() {
		return mimoso;
	}

	public void setMimoso(boolean mimoso) {
		this.mimoso = mimoso;
	}

	public String getSonido_que_emite() {
		return sonido_que_emite;
	}

	public void setSonido_que_emite(String sonido_que_emite) {
		this.sonido_que_emite = sonido_que_emite;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int compareTo(Animal_Domestico comparestu) {
		int compareage = ((Animal_Domestico) comparestu).getEdad();
		return this.edad - compareage;
	}

	@Override
	public String toString() {
		return "Animal_Domestico [id_animal=" + id_animal + ", altura=" + altura + ", peso=" + peso + ", edad=" + edad
				+ ", nombre=" + nombre + ", especie=" + especie + ", mimoso=" + mimoso + ", sonido_que_emite="
				+ sonido_que_emite + ", propietario=" + propietario + "]";
	}

}
