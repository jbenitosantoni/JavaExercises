package clases_starwars_modificado;

public class Padawan {
	private String nombre;
	private int edad;
	private int fuerza;
	private int potencial;
	private String planeta;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		if (fuerza >= 0 && fuerza <= 10) {
			this.fuerza = fuerza;
		} else {
			System.out.println("Fuerza debe estar comprendida entre 0 y 10");
		}
	}

	public int getPotencial() {
		return potencial;
	}

	public void setPotencial(int potencial) {
		this.potencial = potencial;
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	public Padawan(String nombre, int edad, int fuerza, int potencial, String planeta) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fuerza = fuerza;
		this.potencial = potencial;
		this.planeta = planeta;
	}

	@Override
	public String toString() {
		return "Padawan [nombre=" + nombre + ", edad=" + edad + ", fuerza=" + fuerza + ", potencial=" + potencial
				+ ", planeta=" + planeta + "]";
	}

}
