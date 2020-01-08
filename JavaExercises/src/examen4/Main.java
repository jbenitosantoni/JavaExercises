package examen4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Liga> ligasPrincipal = new ArrayList<Liga>();
		ArrayList<Partido> partidosPrincipal = new ArrayList<Partido>();
		rellenarDatos(ligasPrincipal, partidosPrincipal);
		for (int i = 0; i < ligasPrincipal.size(); i++) {
			System.out.println(ligasPrincipal.get(i).toString());
		}
		for (int i = 0; i < partidosPrincipal.size(); i++) {
			System.out.println(partidosPrincipal.get(i).toString());
		}
	}

	public static Boolean existeJugador(ArrayList<Jugador> jugadores, Jugador jugador) {
		boolean existe = false;
		for (int i = 0; i < jugadores.size(); i++) {
			if (jugadores.get(i).getNomApe().equalsIgnoreCase(jugador.getNomApe())) {
				existe = true;
			}
		}
		return existe;
	}

	public static ArrayList<String> jugadoresOequiposNingunGol(ArrayList<Partido> partidosPrincipal) {
		ArrayList<String> nombres = new ArrayList<String>();
		int contadorequipo1 = 0;
		int posicion1 = 0;
		int contadorequipo2 = 0;
		int posicion2 = 0;
		int contadorequipo3 = 0;
		int posicion3 = 0;
		int contadorequipo4 = 0;
		int posicion4 = 0;
		for (int i = 0; i < partidosPrincipal.size(); i++) {
			if (partidosPrincipal.get(i).getEquipoVisitante().getNombre().equalsIgnoreCase("FC Barcelona")) {
				contadorequipo1 = contadorequipo1 + partidosPrincipal.get(i).getGolesVisitante();
				posicion1 = i;
			}
			if (partidosPrincipal.get(i).getEquipoVisitante().getNombre().equalsIgnoreCase("Real Madrid")) {
				contadorequipo2 = contadorequipo2 + partidosPrincipal.get(i).getGolesVisitante();
				posicion2 = i;
			}
			if (partidosPrincipal.get(i).getEquipoVisitante().getNombre().equalsIgnoreCase("AT. Madrid")) {
				contadorequipo3 = contadorequipo3 + partidosPrincipal.get(i).getGolesVisitante();
				posicion3 = i;
			}
			if (partidosPrincipal.get(i).getEquipoVisitante().getNombre().equalsIgnoreCase("Bayern Munich")) {
				contadorequipo4 = contadorequipo4 + partidosPrincipal.get(i).getGolesVisitante();
				posicion4 = i;
			}
			if (partidosPrincipal.get(i).getEquipoLocal().getNombre().equalsIgnoreCase("FC Barcelona")) {
				contadorequipo1 = contadorequipo1 + partidosPrincipal.get(i).getGolesLocal();
			}
			if (partidosPrincipal.get(i).getEquipoLocal().getNombre().equalsIgnoreCase("Real Madrid")) {
				contadorequipo2 = contadorequipo2 + partidosPrincipal.get(i).getGolesLocal();
			}
			if (partidosPrincipal.get(i).getEquipoLocal().getNombre().equalsIgnoreCase("AT. Madrid")) {
				contadorequipo3 = contadorequipo3 + partidosPrincipal.get(i).getGolesLocal();
			}
			if (partidosPrincipal.get(i).getEquipoLocal().getNombre().equalsIgnoreCase("Bayern Munich")) {
				contadorequipo4 = contadorequipo4 + partidosPrincipal.get(i).getGolesLocal();
			}
		}
		if (contadorequipo1 == 0) {
			nombres.add(partidosPrincipal.get(posicion1).getEquipoLocal().getNombre());
		}
		if (contadorequipo2 == 0) {
			nombres.add(partidosPrincipal.get(posicion2).getEquipoLocal().getNombre());
		}
		if (contadorequipo3 == 0) {
			nombres.add(partidosPrincipal.get(posicion3).getEquipoLocal().getNombre());
		}
		if (contadorequipo4 == 0) {
			nombres.add(partidosPrincipal.get(posicion4).getEquipoLocal().getNombre());
		}
		return nombres;
	}

	public static ArrayList<String> jugadoresEqupipoMasGoleador(ArrayList<Partido> partidosPrincipal) {
		ArrayList<String> nombres = new ArrayList<String>();
		int contadorequipo1 = 0;
		int posicion1 = 0;
		int contadorequipo2 = 0;
		int posicion2 = 0;
		int contadorequipo3 = 0;
		int posicion3 = 0;
		int contadorequipo4 = 0;
		int posicion4 = 0;
		for (int i = 0; i < partidosPrincipal.size(); i++) {
			if (partidosPrincipal.get(i).getEquipoVisitante().getNombre().equalsIgnoreCase("FC Barcelona")) {
				contadorequipo1 = contadorequipo1 + partidosPrincipal.get(i).getGolesVisitante();
				posicion1 = i;
			}
			if (partidosPrincipal.get(i).getEquipoVisitante().getNombre().equalsIgnoreCase("Real Madrid")) {
				contadorequipo2 = contadorequipo2 + partidosPrincipal.get(i).getGolesVisitante();
				posicion2 = i;
			}
			if (partidosPrincipal.get(i).getEquipoVisitante().getNombre().equalsIgnoreCase("AT. Madrid")) {
				contadorequipo3 = contadorequipo3 + partidosPrincipal.get(i).getGolesVisitante();
				posicion3 = i;
			}
			if (partidosPrincipal.get(i).getEquipoVisitante().getNombre().equalsIgnoreCase("Bayern Munich")) {
				contadorequipo4 = contadorequipo4 + partidosPrincipal.get(i).getGolesVisitante();
				posicion4 = i;
			}
			if (partidosPrincipal.get(i).getEquipoLocal().getNombre().equalsIgnoreCase("FC Barcelona")) {
				contadorequipo1 = contadorequipo1 + partidosPrincipal.get(i).getGolesLocal();
			}
			if (partidosPrincipal.get(i).getEquipoLocal().getNombre().equalsIgnoreCase("Real Madrid")) {
				contadorequipo2 = contadorequipo2 + partidosPrincipal.get(i).getGolesLocal();
			}
			if (partidosPrincipal.get(i).getEquipoLocal().getNombre().equalsIgnoreCase("AT. Madrid")) {
				contadorequipo3 = contadorequipo3 + partidosPrincipal.get(i).getGolesLocal();
			}
			if (partidosPrincipal.get(i).getEquipoLocal().getNombre().equalsIgnoreCase("Bayern Munich")) {
				contadorequipo4 = contadorequipo4 + partidosPrincipal.get(i).getGolesLocal();
			}
		}
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(contadorequipo1);
		numeros.add(contadorequipo2);
		numeros.add(contadorequipo3);
		numeros.add(contadorequipo4);

		int devolvemos = 0;
		if (Collections.max(numeros) == contadorequipo1) {
			devolvemos = posicion1;
		}
		if (Collections.max(numeros) == contadorequipo2) {
			devolvemos = posicion2;
		}
		if (Collections.max(numeros) == contadorequipo3) {
			devolvemos = posicion3;
		}
		if (Collections.max(numeros) == contadorequipo4) {
			devolvemos = posicion4;
		}
		for (int i = 0; i < partidosPrincipal.get(devolvemos).getEquipoVisitante().getJugadores().size(); i++) {
			nombres.add(partidosPrincipal.get(devolvemos).getEquipoVisitante().getJugadores().get(i).getNomApe());
		}
		return nombres;
	}

	public static ArrayList<Jugador> jugadoresNacionalidad(ArrayList<Liga> ligasPrincipal, String nacionalidad) {
		ArrayList<Jugador> jugadoresdevoler = new ArrayList<Jugador>();
		for (int i = 0; i < ligasPrincipal.size(); i++) {
			for (int j = 0; j < ligasPrincipal.get(i).getEquipos().size(); j++) {
				for (int z = 0; z < ligasPrincipal.get(i).getEquipos().get(j).getJugadores().size(); z++) {
					if (ligasPrincipal.get(i).getEquipos().get(j).getJugadores().get(z).getNacionalidad()
							.equalsIgnoreCase(nacionalidad)) {
						jugadoresdevoler.add(ligasPrincipal.get(i).getEquipos().get(j).getJugadores().get(z));
					}
				}
			}
		}
		return jugadoresdevoler;
	}

	public static String arbitroPartidoMasGoles(ArrayList<Partido> partidosPrincipal) {
		int contador = 0;
		int posicion = 0;
		for (int i = 0; i < partidosPrincipal.size(); i++) {
			if ((partidosPrincipal.get(i).getGolesLocal() + partidosPrincipal.get(i).getGolesVisitante()) > contador) {
				contador = partidosPrincipal.get(i).getGolesLocal() + partidosPrincipal.get(i).getGolesVisitante();
				posicion = i;
			}
		}
		return partidosPrincipal.get(posicion).getArbi().getNomApe();
	}

	public static Equipo equipoMasPerdidosVisitante(ArrayList<Partido> partidos) {
		ArrayList<String> equipos = new ArrayList<String>();
		for (int i = 0; i < partidos.size(); i++) {
			if (partidos.get(i).getGolesLocal() > partidos.get(i).getGolesVisitante()) {
				equipos.add(partidos.get(i).getEquipoVisitante().getNombre());
			}
		}
		Map<String, Long> mapa = equipos.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		String s = mapa.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		int posicion = 0;
		for (int i = 0; i < partidos.size(); i++) {
			if (partidos.get(i).getEquipoVisitante().getNombre().equalsIgnoreCase(s)) {
				posicion = i;
			}
		}
		return partidos.get(posicion).getEquipoVisitante();
	}

	public static Equipo equipoMasPartidosLocal(ArrayList<Partido> partidos) {
		ArrayList<String> equipos = new ArrayList<String>();
		for (int i = 0; i < partidos.size(); i++) {
			equipos.add(partidos.get(i).getEquipoLocal().getNombre());
		}
		Map<String, Long> mapa = equipos.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		String s = mapa.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		int posicion = 0;
		for (int i = 0; i < partidos.size(); i++) {
			if (partidos.get(i).getEquipoLocal().getNombre().equalsIgnoreCase(s)) {
				posicion = i;
			}
		}
		return partidos.get(posicion).getEquipoLocal();
	}

	public static ArrayList<Integer> goles(ArrayList<Partido> partidos) {
		ArrayList<Integer> devolver = new ArrayList<Integer>();
		for (int i = 0; i < partidos.size(); i++) {
			if (partidos.get(i).getCiudad().equalsIgnoreCase("Madrid")) {
				devolver.add(partidos.get(i).getGolesLocal());
			}
		}
		return devolver;
	}

	public static Boolean equipoExisteEnLiga(Liga liga, Equipo equipo) {
		boolean existe = false;
		for (int i = 0; i < liga.getEquipos().size(); i++) {
			if (liga.getEquipos().get(i).getNombre().equalsIgnoreCase(equipo.getNombre())) {
				existe = true;
			}
		}
		return existe;
	}

	public static void rellenarDatos(ArrayList<Liga> ligasPrincipal, ArrayList<Partido> partidosPrincipal) {
		ArrayList<Jugador> jugadores1 = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadores2 = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadores3 = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadores4 = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadores5 = new ArrayList<Jugador>();
		jugadores1.add(new Jugador("Lionel Messi", "11111", "Rosario", "Argentina", 33, 10, 1000000.22));
		jugadores1.add(new Jugador("Ter Stegen", "18911", "Berl�n", "Alemana", 25, 1, 500000.22));
		jugadores1.add(new Jugador("Luis Suarez", "11199", "Canillas", "Uruguay", 31, 9, 200000.22));
		jugadores1.add(new Jugador("Grizzman", "11100", "Paris", "Francesa", 29, 11, 800000.22));
		jugadores1.add(new Jugador("Gerar Pique", "33311", "Andorra", "Española", 34, 8, 300000.22));
		jugadores1.add(new Jugador("Lenglet", "44411", "Lion", "Francesa", 28, 14, 400000.22));

		jugadores2.add(new Jugador("Sergio Ramos", "77658", "Cadiz", "Española", 38, 8, 1000000.22));
		jugadores2.add(new Jugador("Karim Benzema", "22353", "Paris", "Francesa", 34, 11, 500000.22));
		jugadores2.add(new Jugador("Garet Bale", "33432", "Stune", "Galesa", 33, 91, 20000.22));
		jugadores2.add(new Jugador("Carbajal", "090987", "Valladolid", "Espa�ola", 31, 16, 100000.22));
		jugadores2.add(new Jugador("Varanne", "880000", "Marsella", "Francesa", 34, 81, 500000.22));
		jugadores2.add(new Jugador("Courtua", "99998", "Bruselas", "Belga", 29, 24, 900000.22));

		jugadores3.add(new Jugador("Godin", "44658", "Cadiz", "Uruguay", 28, 7, 1000000.22));
		jugadores3.add(new Jugador("Jimenez", "44353", "Paris", "Francesa", 22, 6, 500000.22));
		jugadores3.add(new Jugador("Juanfran", "44432", "Stune", "Espa�ola", 23, 2, 20000.22));
		jugadores3.add(new Jugador("Diego Costa", "440987", "Valladolid", "Esañola", 31, 8, 100000.22));
		jugadores3.add(new Jugador("Morata", "440000", "Marsella", "Espa�ola", 24, 9, 500000.22));
		jugadores3.add(new Jugador("Oblac", "44998", "Bruselas", "Croata", 23, 1, 900000.22));

		jugadores4.add(new Jugador("Muller", "99658", "Berlin", "Alemania", 18, 7, 1000000.22));
		jugadores4.add(new Jugador("Rois", "99353", "Berlin", "Alemania", 22, 6, 500000.22));
		jugadores4.add(new Jugador("Neaur", "99432", "Berlin", "Alemania", 23, 2, 20000.22));
		jugadores4.add(new Jugador("Zapata", "990987", "Coimbra", "Colombia", 33, 8, 100000.22));
		jugadores4.add(new Jugador("Davids", "990000", "Marsella", "Francia", 33, 9, 500000.22));
		jugadores4.add(new Jugador("Thiago", "99998", "Barcelona", "Española", 33, 1, 900000.22));

		Entrenador entre1 = new Entrenador("Pep Guardiola", "989988L", "Barcelona", "Espa�a", 12, 300000.00);
		Entrenador entre2 = new Entrenador("Mouri�o", "997656L", "Lisboa", "Portugal", 16, 200000.00);
		Entrenador entre3 = new Entrenador("Clop", "555555L", "Berl�n", "Alemania", 10, 300000.00);
		Entrenador entre4 = new Entrenador("Lopetegui", "911111L", "Le�n", "España", 16, 400000.00);

		ArrayList<Equipo> equipos1 = new ArrayList<Equipo>();
		Equipo equi1 = new Equipo("FC Barcelona", "Barcelona", 45, "Camp Nou", 98000, 200000000, jugadores1, entre1);
		Equipo equi2 = new Equipo("Real Madrid", "Madrid", 45, "Bernabeu", 95000, 300000000, jugadores2, entre2);
		equipos1.add(equi1);
		equipos1.add(equi2);
		ArrayList<Equipo> equipos2 = new ArrayList<Equipo>();
		Equipo equi3 = new Equipo("AT. Madrid", "Madrid", 45, "Wanda Metropolitano", 90000, 100000000, jugadores3,
				entre3);
		equipos2.add(equi3);
		ArrayList<Equipo> equipos3 = new ArrayList<Equipo>();
		Equipo equi4 = new Equipo("Bayern Munich", "Munich", 45, "Alianze Arena", 96000, 500000000, jugadores4, entre4);
		equipos3.add(equi4);

		Liga ligaEspanola = new Liga("Liga Santander", "Espa�a", "1�", equipos1);
		Liga ligaAlemana = new Liga("Liga Alemana", "Alemania", "1�", equipos3);
		Liga ligaNos = new Liga("Liga Portuguesa", "Portugal", "2�", equipos2);

		ligasPrincipal.add(ligaEspanola);
		ligasPrincipal.add(ligaAlemana);
		ligasPrincipal.add(ligaNos);

		Arbitro arbi1 = new Arbitro("Undiano Mallenco", "5544456H", "Burgos", "Espa�a", 23);
		Arbitro arbi2 = new Arbitro("Antonio Mancilla", "5211111H", "Santander", "Espa�a", 12);
		Arbitro arbi3 = new Arbitro("Ernesto Sevilla", "5144456G", "Madrid", "Espa�a", 11);
		Arbitro arbi4 = new Arbitro("Palomino de Cerras", "5544444H", "Sevilla", "Espa�a", 5);

		partidosPrincipal.add(new Partido("18-12-2019", "Barcelona", "Camp Nou", equi1, equi2, 5, 1, arbi1));
		partidosPrincipal.add(new Partido("11-02-2020", "Madrid", "Bernabeu", equi2, equi1, 2, 6, arbi2));
		partidosPrincipal.add(new Partido("12-04-2020", "Madrid", "Wanda Metropolitano", equi3, equi1, 1, 4, arbi1));
		partidosPrincipal.add(new Partido("21-03-2020", "Barcelona", "Camp Nou", equi1, equi4, 3, 0, arbi3));
		partidosPrincipal.add(new Partido("11-05-2020", "Barcelona", "Camp Nou", equi1, equi3, 4, 0, arbi2));
		partidosPrincipal.add(new Partido("06-06-2020", "Madrid", "Bernabeu", equi2, equi3, 2, 4, arbi4));

	}

}
