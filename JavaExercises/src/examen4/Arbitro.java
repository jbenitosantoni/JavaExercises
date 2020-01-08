package examen4;

public class Arbitro {
	private String nomApe;
	private String dni;
	private String ciudadProcedencia;
	private String nacionalidad;
	private int experiencia;

	public Arbitro(String nomApe, String dni, String ciudadProcedencia, String nacionalidad, int experiencia) {
		super();
		this.nomApe = nomApe;
		this.dni = dni;
		this.ciudadProcedencia = ciudadProcedencia;
		this.nacionalidad = nacionalidad;
		this.experiencia = experiencia;
	}

	public Arbitro() {
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

	@Override
	public String toString() {
		return "Arbitro [nomApe=" + nomApe + ", dni=" + dni + ", ciudadProcedencia=" + ciudadProcedencia
				+ ", nacionalidad=" + nacionalidad + ", experiencia=" + experiencia + "]";
	}

}
