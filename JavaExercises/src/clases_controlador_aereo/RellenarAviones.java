package clases_controlador_aereo;

public class RellenarAviones {
	public static void RellenarAviones(Avion[] avion) {
		String marca[] = { "Marca1", "Marca2", "Marca2", "Marca2", "Marca2", "Marca2", "Marca2", "Marca2", "Marca2",
				"Marca2" };
		String modelo[] = { "Modelo1", "Modelo2", "Modelo2", "Modelo2", "Modelo2", "Modelo2", "Modelo2", "Modelo2",
				"Modelo2", "Modelo2" };
		double capacidad_deposito[] = { 289.8, 27362.2, 27362.2, 27362.2, 27362.2, 27362.2, 27362.2, 27362.2, 27362.2,
				27362.2 };
		int capacidad_pasajeros[] = { 20, 240, 240, 240, 240, 240, 240, 240, 240, 240 };
		String matricula[] = { "3621s", "1548s", "1548s", "1548s", "1548s", "1548s", "1548s", "1548s", "1548s",
				"1548s" };
		for (int i = 0; i < avion.length; i++) {
			avion[i] = new Avion(marca[i], modelo[i], capacidad_deposito[i], capacidad_pasajeros[i], matricula[i]);
		}
	}
}
