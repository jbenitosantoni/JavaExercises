package examen4;

public class Entrenador {
	private String nomApe;
	private String dni;
	private String ciudadProcedencia;
	private String nacionalidad;
	private int experiencia;
	private double sueldo;

	public Entrenador(String nomApe, String dni, String ciudadProcedencia, String nacionalidad, int experiencia,
			double sueldo) {
		super();
		this.nomApe = nomApe;
		this.dni = dni;
		this.ciudadProcedencia = ciudadProcedencia;
		this.nacionalidad = nacionalidad;
		this.experiencia = experiencia;
		this.sueldo = sueldo;
	}

	public Entrenador() {
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

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Entrenador [nomApe=" + nomApe + ", dni=" + dni + ", ciudadProcedencia=" + ciudadProcedencia
				+ ", nacionalidad=" + nacionalidad + ", experiencia=" + experiencia + ", sueldo=" + sueldo + "]";
	}

}
