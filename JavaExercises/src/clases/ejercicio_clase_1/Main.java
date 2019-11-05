package clases.ejercicio_clase_1;

public class Main {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Javier", "Benito", "12", "02222222y", 20, 9.99);
		Alumno alumno2 = new Alumno("Juan");
		System.out.println(alumno1.getNombre() + " " + alumno1.getApellidos());
	}

}
