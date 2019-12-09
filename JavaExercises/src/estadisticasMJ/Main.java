package estadisticasMJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Estadistica> estadisticas = new ArrayList<Estadistica>();

	}

	public static Estadistica masPPP(ArrayList<Estadistica> estadisticas) {
		double mayor = 0;
		int indice = 0;
		for (int i = 0; i < estadisticas.size(); i++) {
			if (estadisticas.get(i).getPuntospartido() > mayor) {
				mayor = estadisticas.get(i).getPuntospartido();
				indice = i;
			}
		}
		return estadisticas.get(indice);
	}

	public static double mediaRobosSolicitar(ArrayList<Estadistica> estadisticas) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primera temporada");
		String temporada = sc.nextLine();
		double puntos = 0;
		Boolean existe = false;
		for (int i = 0; i < estadisticas.size(); i++) {
			if (temporada.equalsIgnoreCase(estadisticas.get(i).getTemporada())) {
				puntos = puntos + estadisticas.get(i).getRobospartido();
				existe = true;
			}
		}
		if (!existe) {
			System.out.println("Temporada no existe");
		}
		existe = false;
		System.out.println("Introduce segunda temporada");
		temporada = sc.nextLine();
		for (int i = 0; i < estadisticas.size(); i++) {
			if (temporada.equalsIgnoreCase(estadisticas.get(i).getTemporada())) {
				puntos = puntos + estadisticas.get(i).getRobospartido();
				existe = true;
			}
		}
		if (!existe) {
			System.out.println("Temporada no existe");
		}
		return puntos;
	}

	public static double mediaPuntosSolicitar(ArrayList<Estadistica> estadisticas) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primera temporada");
		String temporada = sc.nextLine();
		double puntos = 0;
		Boolean existe = false;
		for (int i = 0; i < estadisticas.size(); i++) {
			if (temporada.equalsIgnoreCase(estadisticas.get(i).getTemporada())) {
				puntos = puntos + estadisticas.get(i).getPuntospartido();
				existe = true;
			}
		}
		if (!existe) {
			System.out.println("Temporada no existe");
		}
		existe = false;
		System.out.println("Introduce segunda temporada");
		temporada = sc.nextLine();
		for (int i = 0; i < estadisticas.size(); i++) {
			if (temporada.equalsIgnoreCase(estadisticas.get(i).getTemporada())) {
				puntos = puntos + estadisticas.get(i).getPuntospartido();
				existe = true;
			}
		}
		if (!existe) {
			System.out.println("Temporada no existe");
		}
		existe = false;
		System.out.println("Introduce segunda temporada");
		temporada = sc.nextLine();
		for (int i = 0; i < estadisticas.size(); i++) {
			if (temporada.equalsIgnoreCase(estadisticas.get(i).getTemporada())) {
				puntos = puntos + estadisticas.get(i).getPuntospartido();
				existe = true;
			}
		}
		if (!existe) {
			System.out.println("Temporada no existe");
		}
		return puntos;
	}

	public static double mediaJordanAsistenciasTodasTemporadas(ArrayList<Estadistica> estadisticas) {
		double puntos = 0;
		for (int i = 0; i < estadisticas.size(); i++) {
			puntos = puntos + estadisticas.get(i).getAsistentciaspartido();
		}
		puntos = puntos / estadisticas.size();
		return puntos;
	}

	public static double mediaJordanRebotesTodasTemporadas(ArrayList<Estadistica> estadisticas) {
		double puntos = 0;
		for (int i = 0; i < estadisticas.size(); i++) {
			puntos = puntos + estadisticas.get(i).getRebotespartido();
		}
		puntos = puntos / estadisticas.size();
		return puntos;
	}

	public static double mediaJordanTodasTemporadas(ArrayList<Estadistica> estadisticas) {
		double puntos = 0;
		for (int i = 0; i < estadisticas.size(); i++) {
			puntos = puntos + estadisticas.get(i).getPuntospartido();
		}
		puntos = puntos / estadisticas.size();
		return puntos;
	}

	public static Estadistica datosTemorada(ArrayList<Estadistica> estadisticas) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce temporada");
		String temporada = sc.nextLine();
		for (int i = 0; i < estadisticas.size(); i++) {
			if (temporada.equalsIgnoreCase(estadisticas.get(i).getTemporada())) {
				return estadisticas.get(i);
			}
		}
		return null;
	}

	public static void mostrarTodo(ArrayList<Estadistica> estadisticas) {
		for (int i = 0; i < estadisticas.size(); i++) {
			System.out.println(estadisticas.get(i).toString());
		}
	}

	public static void rellenarDatos(ArrayList<Estadistica> estadisticas) {
		estadisticas.add(new Estadistica("Temporada 90/91", 30.3, 6.4, 4.3, 2.3));
		estadisticas.add(new Estadistica("Temporada 91/92", 31.6, 5.2, 5.2, 3.5));
		estadisticas.add(new Estadistica("Temporada 92/93", 32.7, 4.8, 6.7, 3.1));
		estadisticas.add(new Estadistica("Temporada 95/96", 34.2, 7.1, 4.3, 4));
		estadisticas.add(new Estadistica("Temporada 96/97", 31.8, 6.5, 4.2, 2.1));
		estadisticas.add(new Estadistica("Temporada 97/98", 30.8, 5.3, 5.9, 2.7));
	}

	public static void menu() {
		System.out.println("1. Mostrar datos de todas las temporadas.\n"
				+ "2. Mostrar datos de una temporada. (Pedir la temporada al usuario).\n"
				+ "3. Modificar algún dato, de una temporada solicitada al usuario.\n"
				+ "4. Mostrar la media de puntos de Michael Jordan en todas las temporadas.\n"
				+ "5. Mostrar la media de rebotes de Michael Jordan en todas las temporadas.\n"
				+ "6. Mostrar la media de asistencias de Michael Jordan en todas las temporadas.\n"
				+ "7. Mostrar la media de puntos de Michael Jordan en tres temporadas solicitadas al usuario.\n"
				+ "8. Mostrar la media de robos de Michael Jordan en dos temporadas solicitadas al usuario.\n"
				+ "9. Mostrar los datos de la temporada que más PPP ha metido MJ.\n" + "10. Salir.");
	}
}
