package examen3;

public class Equipo {
	private String nombre;
	private String ciudad;
	private String division;

	public Equipo() {

	}

	public Equipo(String nombre, String ciudad, String division) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.division = division;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		if (division.equalsIgnoreCase("1ª") || division.equalsIgnoreCase("2ª") || division.equalsIgnoreCase("3ª")) {
			this.division = division;
		} else {
			System.out.println("Division incorrecta");
		}
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", division=" + division + "]";
	}

}
