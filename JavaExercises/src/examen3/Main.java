package examen3;

public class Main {

	public static void main(String[] args) {
	}

	public static void rellenarJugadores(Jugador[] jugadores) {
		jugadores[0] = new Jugador("Michael", "Conley", "A9879HJ", "USA", 29, 196, 90);
		jugadores[1] = new Jugador("Dennis", "Rodman", "C5679HU", "POR", 21, 198, 100);
		jugadores[2] = new Jugador("Michael", "Jordan", "F5579VT", "ESP", 22, 199, 96);
		jugadores[3] = new Jugador("Michael", "Finley", "F8879MM", "IT", 32, 193, 94);
		jugadores[4] = new Jugador("Robert", "Paris", "J1232QL", "POR", 26, 208, 110);
		jugadores[5] = new Jugador("Steve", "Ker", "E2222GQ", "FR", 33, 187, 81);
		jugadores[6] = new Jugador("Jhon", "Paxon", "W1121AS", "ALE", 22, 184, 81);
		jugadores[7] = new Jugador("Scottie", "Pippen", "P6680RL", "CHI", 37, 200, 99);
		jugadores[8] = new Jugador("Tony", "Kukoc", "L3255FF", "CHI", 31, 203, 96);
		jugadores[9] = new Jugador("Randy", "Brown", "A8888FG", "USA", 30, 193, 102);
	}

	public static void rellenarEquipos(Equipo[] equipos) {
		equipos[0] = new Equipo("F.C. Barcelona", "Barcelona", "1�");
		equipos[1] = new Equipo("Real Madrid", "Madrid", "1�");
		equipos[2] = new Equipo("Fuenlabrada", "Fuenlabrada", "1�");
		equipos[3] = new Equipo("Basket Torrelodones", "Torrelodones", "2�");
		equipos[4] = new Equipo("Juventud", "Badalona", "3�");
		equipos[5] = new Equipo("C.B. Segoviana", "Segovia", "1�");
		equipos[6] = new Equipo("Estudiantes", "Madrid", "2�");
		equipos[7] = new Equipo("C.B.Elosua", "León", "2�");
	}

	public static void rellenarArbitros(Arbitro[] arbitros) {
		arbitros[0] = new Arbitro("Tony", "Schibely", "0900005K", "ESP", 8, 79);
		arbitros[1] = new Arbitro("Miguel", "Betancor", "0234521K", "ESP", 4, 90);
		arbitros[2] = new Arbitro("Kino", "Salvo", "08745553K", "ESP", 5, 45);
		arbitros[3] = new Arbitro("Francesco", "Messina", "0890450K", "ESP", 8, 88);
		arbitros[4] = new Arbitro("Eduardo", "Fernandez", "0111214K", "ESP", 9, 37);
	}

	public static void rellenarLigas(Liga[] ligas) {
		Equipo[] equipos1 = new Equipo[4];
		Equipo[] equipos2 = new Equipo[4];
		Equipo[] equipos3 = new Equipo[4];
		Equipo[] equipos4 = new Equipo[4];
		Equipo[] equipos5 = new Equipo[4];
		Equipo[] equipos6 = new Equipo[4];

		equipos1[0] = new Equipo("F.C. Barcelona", "Barcelona", "1�");
		equipos1[1] = new Equipo("Burgos", "Burgos", "1�");
		equipos1[2] = new Equipo("Segoviana", "Segovia", "1�");
		equipos1[3] = new Equipo("Pau", "Carabanchel", "2�");

		equipos2[0] = new Equipo("Avila", "Avila", "3�");
		equipos2[1] = new Equipo("Leon", "Leon", "1�");
		equipos2[2] = new Equipo("Ponfe", "Ponferrada", "1�");
		equipos2[3] = new Equipo("La ciana", "La Ciana", "2�");

		equipos3[0] = new Equipo("Coru�a", "Coru�a", "3�");
		equipos3[1] = new Equipo("Lugo", "Lugo", "1�");
		equipos3[2] = new Equipo("Ponte", "Ponte", "1�");
		equipos3[3] = new Equipo("Vigo", "Vigo", "2�");

		equipos4[0] = new Equipo("Jaen", "Jaen", "3�");
		equipos4[1] = new Equipo("Cadiz", "Cadiz", "1�");
		equipos4[2] = new Equipo("Almeria", "Almeria", "1�");
		equipos4[3] = new Equipo("Cordoba", "Cordoba", "2�");

		equipos5[0] = new Equipo("Valencia", "Valencia", "3�");
		equipos5[1] = new Equipo("Murcia", "Murcia", "1�");
		equipos5[2] = new Equipo("Alicante", "Alicante", "1�");
		equipos5[3] = new Equipo("Dehesa", "Dehesa", "2�");

		equipos6[0] = new Equipo("Santander", "Santander", "3�");
		equipos6[1] = new Equipo("Santo�a", "Santo�a", "1�");
		equipos6[2] = new Equipo("Laredo", "Laredo", "1�");
		equipos6[3] = new Equipo("Rieras", "Rieras", "2�");

		ligas[0] = new Liga("Lega", "Italia", equipos1);
		ligas[1] = new Liga("ACB", "España", equipos2);
		ligas[2] = new Liga("NBA", "USA", equipos3);
		ligas[3] = new Liga("LigaConforama", "Francia", equipos4);
		ligas[4] = new Liga("Premier", "Inglaterra", equipos5);
		ligas[5] = new Liga("Portuguesa", "Portugal", equipos6);
	}

	public static void mostrarJugadoresMas20(Jugador[] jugadores) {
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i].getEdad() > 20) {
				System.out.println(jugadores[i].getnumeroLicencia());
			}
		}
	}

	public static Arbitro arbitroApellidoMasLargo(Arbitro[] arbitros) {
		int maslargo = 0;
		int posicionmaslargo = 0;
		for (int i = 0; i < arbitros.length; i++) {
			if (arbitros[i].getApellidos().length() > maslargo) {
				maslargo = arbitros[i].getApellidos().length();
				posicionmaslargo = i;
			}
		}
		return arbitros[posicionmaslargo];
	}

	public static Arbitro arbitroMayorPotencial(Arbitro[] arbitros) {
		double potencial = 0.0;
		int posicion = 0;
		for (int i = 0; i < arbitros.length; i++) {
			if (((arbitros[i].getExperiencia() + arbitros[i].getNivel()) / 0.6) > potencial) {
				potencial = (arbitros[i].getExperiencia() + arbitros[i].getNivel()) / 0.6;
				posicion = i;
			}
		}
		return arbitros[posicion];
	}

	public static Equipo[] equiposEnLiga(Liga[] ligas, String pais) {
		Boolean existe = false;
		int valori = 0;
		for (int i = 0; i < ligas.length; i++) {
			if (ligas[i].getPais().equalsIgnoreCase(pais)) {
				valori = i;
				existe = true;
			}
		}
		if (!existe) {
			Equipo[] vacio = new Equipo[1];
			return vacio;
		} else {
			Equipo[] equiposReturn = new Equipo[ligas[valori].getEquipos().length];
			for (int i = 0; i < ligas[valori].getEquipos().length; i++) {
				equiposReturn[i] = ligas[valori].getEquipos()[i];
			}
			return equiposReturn;
		}
	}

	public static Arbitro[] arbitrosMayorExp(Arbitro[] arbitros) {
		int primeraexp = 0;
		int posicionprimeraexp = 0;
		int segundaexp = 0;
		int posicionsegundaexp = 0;
		int terceraexp = 0;
		int posicionterceraexp = 0;
		for (int i = 0; i < arbitros.length; i++) {
			if (arbitros[i].getExperiencia() > primeraexp) {
				primeraexp = arbitros[i].getExperiencia();
				posicionprimeraexp = i;
			}
		}
		for (int i = 0; i < arbitros.length; i++) {
			if (arbitros[i].getExperiencia() > segundaexp
					&& arbitros[i].getDni() != arbitros[posicionprimeraexp].getDni()) {
				segundaexp = arbitros[i].getExperiencia();
				posicionsegundaexp = i;
			}
		}
		for (int i = 0; i < arbitros.length; i++) {
			if (arbitros[i].getExperiencia() > terceraexp
					&& arbitros[i].getDni() != arbitros[posicionprimeraexp].getDni()
					&& arbitros[i].getDni() != arbitros[posicionsegundaexp].getDni()) {
				terceraexp = arbitros[i].getExperiencia();
				posicionterceraexp = i;
			}
		}
		Arbitro[] devolver = new Arbitro[3];
		devolver[0] = arbitros[posicionprimeraexp];
		devolver[1] = arbitros[posicionsegundaexp];
		devolver[2] = arbitros[posicionterceraexp];
		return devolver;
	}
}
