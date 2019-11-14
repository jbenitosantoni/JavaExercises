package clases_controlador_aereo;

public class RellenarVuelos {
	public static void RellenarVuelos(Vuelo[] vuelo) {
		int[] n_vuelo = { 15545, 15514, 15514, 15514, 15514, 15514, 15514, 15514, 15514, 15514 };
		String[] ciudad = { "Madrid", "Barcelona", "Barcelona", "Barcelona", "Barcelona", "Barcelona", "Barcelona",
				"Barcelona", "Barcelona", "Barcelona" };
		double[] precio = { 125.2, 145.5, 145.5, 145.5, 145.5, 145.5, 145.5, 145.5, 145.5, 145.5 };
		for (int i = 0; i < vuelo.length; i++) {
			vuelo[i] = new Vuelo(n_vuelo[i], ciudad[i], precio[i]);
		}
	}
}
