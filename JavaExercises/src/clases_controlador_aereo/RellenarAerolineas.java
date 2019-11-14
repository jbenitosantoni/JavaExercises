package clases_controlador_aereo;

public class RellenarAerolineas {
	public static void RellenarAerolineas(Aerolinea[] aerolinea) {
		String[] nombre = { "Primera", "Segunda", "Segunda", "Segunda", "Segunda", "Segunda", "Segunda", "Segunda",
				"Segunda", "Segunda" };
		String[] pais = { "Francia", "Cuba", "Cuba", "Cuba", "Cuba", "Cuba", "Cuba", "Cuba", "Cuba", "Cuba" };
		for (int i = 0; i < aerolinea.length; i++) {
			aerolinea[i] = new Aerolinea(nombre[i], pais[i]);
		}
	}
}
