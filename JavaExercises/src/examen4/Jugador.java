package examen4;

public class Jugador {
	private String nomApe;
	private String dni;
	private String ciudadProcedencia;
	private String nacionalidad;
	private int edad;
	private int dorsal;
	private double sueldo;

	public Jugador(String nomApe, String dni, String ciudadProcedencia, String nacionalidad, int edad, int dorsal,
			double sueldo) {
		super();
		this.nomApe = nomApe;
		this.dni = dni;
		this.ciudadProcedencia = ciudadProcedencia;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.dorsal = dorsal;
		this.sueldo = sueldo;
	}

	public Jugador() {
	}

	public String getNomApe() {
		return nomApe;
	}

	public void setNomApe(String nomApe) {
		this.nomApe = nomApe;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCiudadProcedencia() {
		return ciudadProcedencia;
	}

	public void setCiudadProcedencia(String ciudadProcedencia) {
		this.ciudadProcedencia = ciudadProcedencia;
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

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double indicefinanciero() {
		double indice = (this.edad * this.sueldo) / 0.5;
		return indice;
	}

	@Override
	public String toString() {
		return "Jugador [nomApe=" + nomApe + ", dni=" + dni + ", ciudadProcedencia=" + ciudadProcedencia
				+ ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", dorsal=" + dorsal + ", sueldo=" + sueldo
				+ "]";
	}

}
