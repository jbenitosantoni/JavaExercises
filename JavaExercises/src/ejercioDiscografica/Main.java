package ejercioDiscografica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		// Declaro un array de 10 objetos de tipo cancion.
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();

		// Llamo al m�todo que rellena el array de canciones con canciones reales
		Main.rellenarCanciones(canciones);

		int opc = 0;
		do {
			// Llamo al m�todo que muestra el men� de nuestra aplicaci�n.
			Main.mostrarMenu();
			opc = sn.nextInt();
			switch (opc) {
			case 1:
				Main.mostrarTodasCanciones(canciones);
				break;
			case 2:
				Main.mostrar4min(canciones);
				break;
			case 3:
				Main.duracionMayorTitulo(canciones);
				break;
			case 4:
				Main.mostrarTitulosComa(canciones);
				break;
			case 5:
				Main.sumaDuracion(canciones);
				break;
			case 6:

			}
		} while (opc != 7);
		sn.close();

	}

	/**
	 * M�todo que muestra en pantalla el men� de opciones del ejercicio en el que
	 * est�s.
	 */
	public static void mostrarMenu() {
		System.out.println("1. Mostrar la titulo de todas las canciones");
		System.out.println("2. Mostrar los títulos de las canciones que su duración no exceda de 4 minutos");
		System.out.println("3. Mostrar la duración de la canción con mayor longitud en el título");
		System.out.println("4. Muestra todos títulos de las canciones separados por comas");
		System.out.println("5. Muestra la duración de la suma de todas las canciones");
		System.out.println("6. Muestra todas las duraciones de todas las canciones");
		System.out.println("7. Salir");
	}

	public static ArrayList mostrarTodasCanciones(ArrayList<Cancion> canciones) {
		ArrayList titulos = new ArrayList();
		for (int i = 0; i < canciones.size(); i++) {
			titulos.add(canciones.get(i).getTitulo());
		}
		return titulos;
	}

	public static ArrayList mostrar4min(ArrayList<Cancion> canciones) {
		ArrayList titulos = new ArrayList();
		for (int i = 0; i < canciones.size(); i++) {
			if (canciones.get(i).getDuracion() <= 4) {
				titulos.add(canciones.get(i).getTitulo());
			}
		}
		return titulos;
	}

	public static double duracionMayorTitulo(ArrayList<Cancion> canciones) {
		double longitud = canciones.get(0).getDuracion();
		for (int i = 1; i < canciones.size(); i++) {
			if (canciones.get(i).getTitulo().length() > canciones.get(i - 1).getTitulo().length()) {
				longitud = canciones.get(i).getDuracion();
			}
		}
		return longitud;
	}

	public static ArrayList mostrarTitulosComa(ArrayList<Cancion> canciones) {
		ArrayList titulos = new ArrayList();
		for (int i = 0; i < canciones.size(); i++) {
			titulos.add(canciones.get(i).getTitulo() + ", ");
		}
		return titulos;
	}

	public static double sumaDuracion(ArrayList<Cancion> canciones) {
		double duracion = 0;
		for (int i = 0; i < canciones.size(); i++) {
			duracion = canciones.get(i).getDuracion() + duracion;
		}
		return duracion;
	}

	public static ArrayList todasDuraciones(ArrayList<Cancion> canciones) {
		ArrayList duracion = new ArrayList();
		for (int i = 0; i < canciones.size(); i++) {
			duracion.add(canciones.get(i).getDuracion() + ", ");
		}
		return duracion;
	}

	/**
	 * M�todo que rellena el array de canciones con 12 canciones del f�ntastico
	 * grupo Indie Izal.
	 * 
	 * @param canciones (Array de objetos de la clase Cancion)
	 */
	public static void rellenarCanciones(ArrayList<Cancion> canciones) {
		canciones.add(new Cancion("La mujer de verde", 2.1));
		canciones.add(new Cancion("Copacabana", 3.9));
		canciones.add(new Cancion("Pausa", 3));
		canciones.add(new Cancion("Que bi�n", 3));
		canciones.add(new Cancion("P�nico Pr�ctico", 3.6));
		canciones.add(new Cancion("El pozo", 3));
		canciones.add(new Cancion("La increible historia del hombre que no sab�a volar", 3));
		canciones.add(new Cancion("Autoterapia", 4.3));
		canciones.add(new Cancion("Bill Murray", 1));
		canciones.add(new Cancion("El baile", 6));
		canciones.add(new Cancion("Magia y efectos especiales", 4));
		canciones.add(new Cancion("Peque�a gran revoluci�n", 2));
	}

}
