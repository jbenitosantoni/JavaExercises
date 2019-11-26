package ejercicioLigaFutbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creo el array de 20 jugadores
		Jugador[] jugadoresLiga = new Jugador[16];
		// Llamo al método que rellena los 16 jugadores con datos
		rellenarJugadores(jugadoresLiga);
		// Creo un array de 4 equipos
		Equipo[] equiposLiga = new Equipo[4];
		// llamo al método que rellena los 4 equipos con datos pero sin jugadores.
		rellenarEquiposLiga(equiposLiga);
		ArrayList<Arbitro> arbitroslist = new ArrayList<Arbitro>();
		Main.rellenarArbitros(arbitroslist);
		Main.rellenarJugadoresEnEquipos(equiposLiga, jugadoresLiga);
		Main.mostrarJugadoresEnEquipos(equiposLiga);
		ArrayList<String> partidos = new ArrayList();

	}

	public static void rellenarArbitros(ArrayList<Arbitro> arbitroslist) {
		arbitroslist.add(new Arbitro("Javier", "06022326y", 21211, 20, 200));
		arbitroslist.add(new Arbitro("Javier", "06027326y", 21221, 21, 122));
		arbitroslist.add(new Arbitro("Javier", "06021324y", 21231, 10, 100));
		arbitroslist.add(new Arbitro("Javier", "06027326y", 21241, 25, 80));
		arbitroslist.add(new Arbitro("Javier", "06024376y", 21251, 5, 67));
	}

	public static void rellenarJugadores(Jugador[] jugadores) {
		jugadores[0] = new Jugador("Rulo", 1, "Defensa", 4, "Osazo");
		jugadores[1] = new Jugador("Crespo", 2, "Medio", 9, "Pelícano Pico Pico");
		jugadores[2] = new Jugador("Luisjo", 3, "Delantero", 7, "Aeropuerto");
		jugadores[3] = new Jugador("Álvaro", 4, "Defensa", 14, "Evu");
		jugadores[4] = new Jugador("Bruno", 5, "Medio", 10, "Pailoner");
		jugadores[5] = new Jugador("Rafael", 11, "Defensa", 10, "Garras");
		jugadores[6] = new Jugador("Jorge", 12, "Medio", 7, "Tibu");
		jugadores[7] = new Jugador("Iván", 13, "Delantero", 8, "Vicius");
		jugadores[8] = new Jugador("Carlos", 15, "Delantero", 22, "Tochi");
		jugadores[9] = new Jugador("Borja", 16, "Delantero", 12, "El Loco");
		jugadores[10] = new Jugador("Alberto", 21, "Defensa", 21, "Cañitas");
		jugadores[11] = new Jugador("Hector", 22, "Defensa", 4, "Camicace");
		jugadores[12] = new Jugador("Jose Alberto", 23, "Medio", 6, "JJMouriño");
		jugadores[13] = new Jugador("Vivas", 26, "Delantero", 1, "Cafe Torero");
		jugadores[14] = new Jugador("Sebe", 27, "Delantero", 11, "La Mula");
		jugadores[15] = new Jugador("Lucas", 28, "Medio", 1, "El Desconocido");

	}

	public static void rellenarJugadoresEnEquipos(Equipo[] equipo, Jugador[] jugadores) {
		ArrayList<Jugador> jugadoresInsertar = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadoresInsertar2 = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadoresInsertar3 = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadoresInsertar4 = new ArrayList<Jugador>();
		jugadoresInsertar.add(jugadores[0]);
		jugadoresInsertar.add(jugadores[1]);
		jugadoresInsertar.add(jugadores[2]);
		jugadoresInsertar.add(jugadores[3]);
		jugadoresInsertar2.add(jugadores[4]);
		jugadoresInsertar2.add(jugadores[5]);
		jugadoresInsertar2.add(jugadores[6]);
		jugadoresInsertar2.add(jugadores[7]);
		jugadoresInsertar3.add(jugadores[8]);
		jugadoresInsertar3.add(jugadores[9]);
		jugadoresInsertar3.add(jugadores[10]);
		jugadoresInsertar3.add(jugadores[11]);
		jugadoresInsertar4.add(jugadores[12]);
		jugadoresInsertar4.add(jugadores[13]);
		jugadoresInsertar4.add(jugadores[14]);
		jugadoresInsertar4.add(jugadores[15]);
		equipo[0].setJugadores(jugadoresInsertar);
		equipo[1].setJugadores(jugadoresInsertar2);
		equipo[2].setJugadores(jugadoresInsertar3);
		equipo[3].setJugadores(jugadoresInsertar4);
	}

	public static void rellenarEquiposLiga(Equipo[] equipos) {
		equipos[0] = new Equipo("Real Madrid", "Torrevieja", "Playa Grande");
		equipos[1] = new Equipo("F.C.Barcelona", "Barcelona", "Barceloneta");
		equipos[2] = new Equipo("Malaga F.C.", "Malaga", "La Bonica");
		equipos[3] = new Equipo("Leon F.C.", "León", "Bernesga Arena");
	}

	public static void insertarJugadores(Equipo[] equipo, Jugador[] jugadores) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int contador = 0;
		ArrayList<Jugador> jugadoresInsertar = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadoresInsertar2 = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadoresInsertar3 = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadoresInsertar4 = new ArrayList<Jugador>();
		for (int i = 0; i < equipo.length; i++) {
			System.out.println(equipo[i]);
			for (int j = 0; j < 4; j++) {
				System.out.println("Introduce Dorsal de jugador a insertar");
				int dorsal = sn.nextInt();
				if (j == 0) {
					for (int z = 0; z < jugadores.length; z++) {
						if (dorsal == jugadores[z].getDorsal()) {
							jugadoresInsertar.add(jugadores[j]);
						}
					}
					if (j == 3) {
						equipo[i].setJugadores(jugadoresInsertar);
					}
				}
				if (j == 1) {
					for (int z = 0; z < jugadores.length; z++) {
						if (dorsal == jugadores[z].getDorsal()) {
							jugadoresInsertar2.add(jugadores[j]);
						}
					}
					if (j == 3) {
						equipo[i].setJugadores(jugadoresInsertar2);
					}
				}
				if (j == 2) {
					for (int z = 0; z < jugadores.length; z++) {
						if (dorsal == jugadores[z].getDorsal()) {
							jugadoresInsertar3.add(jugadores[j]);
						}
					}
					if (j == 3) {
						equipo[i].setJugadores(jugadoresInsertar3);
					}
				}
				if (j == 3) {
					for (int z = 0; z < jugadores.length; z++) {
						if (dorsal == jugadores[z].getDorsal()) {
							jugadoresInsertar4.add(jugadores[j]);
						}
					}
					if (j == 3) {
						equipo[i].setJugadores(jugadoresInsertar4);
					}
				}
			}
		}

	}

	public static void mostrarJugadoresEnEquipos(Equipo[] equipo) {
		for (int i = 0; i < equipo.length; i++) {
			System.out.println(equipo[i].getNombre());
			for (int j = 0; j < equipo[i].getJugadores().size(); j++) {
				System.out.println(equipo[i].getJugadores().get(j));
			}
		}
	}
}
