package clases_controlador_aereo;

public class RellenarControladores {
	public static void RellenarControladores(Controlador[] controlador) {
		String[] nombre = { "Juan", "Pedro", "Maria", "Maria", "Maria", "Maria", "Maria", "Maria", "Maria", "Maria" };
		String[] apellidos = { "Perez", "Benito", "Benito", "Benito", "Benito", "Benito", "Benito", "Benito", "Benito",
				"Benito" };
		String[] dni = { "25050505u", "05052055d", "05052055d", "05052055d", "05052055d", "05052055d", "05052055d",
				"05052055d", "05052055d", "05052055d" };
		int[] año_nacimiento = { 5, 52, 2, 2, 2, 2, 2, 2, 2, 2 };
		int[] año_experiencia = { 2, 8, 8, 8, 8, 8, 8, 8, 8, 8 };
		int[] nivel = { 4, 8, 6, 6, 6, 6, 6, 6, 6, 6 };
		for (int i = 0; i < controlador.length; i++) {
			controlador[i] = new Controlador(nombre[i], apellidos[i], dni[i], año_nacimiento[i], año_experiencia[i],
					nivel[i]);
		}
	}
}
