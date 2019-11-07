package clases_Page3Ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Jugador[] jugadores = new Jugador[20];
		String nombre = "";
		String apellidos = "";
		String direccion = "";
		String provincia = "";
		String equipo = "";
		int edad = 0;
		int nHijos = 0;
		int ppp = 0;
		int app = 0;
		int rpp = 0;
		int tpp = 0;
		int mpp = 0;
		int perpp = 0;
		int fpp = 0;
		String nombreintro = "";
		String apellidointro = "";
		boolean existe = false;
		boolean apellidoexiste = false;
		int varios = 0;
		int posicion = 0;
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println("Nombre");
			nombre = sc.nextLine();
			System.out.println("Apellidos");
			apellidos = sc.nextLine();
			System.out.println("Direccion");
			direccion = sc.nextLine();
			System.out.println("Provincia");
			provincia = sc.nextLine();
			System.out.println("Equipo");
			equipo = sc.nextLine();
			System.out.println("Edad");
			edad = sn.nextInt();
			System.out.println("Hijos");
			nHijos = sn.nextInt();
			System.out.println("Puntos por partido");
			ppp = sn.nextInt();
			System.out.println("Asistencias por partido");
			app = sn.nextInt();
			System.out.println("Rebotes por partido");
			rpp = sn.nextInt();
			System.out.println("Tapones por partido");
			tpp = sn.nextInt();
			System.out.println("Mates por partido");
			mpp = sn.nextInt();
			System.out.println("Perdidas por partido");
			perpp = sn.nextInt();
			System.out.println("Faltas por partido");
			fpp = sn.nextInt();
			jugadores[i] = new Jugador(nombre, apellidos, direccion, provincia, equipo, edad, nHijos, ppp, app, rpp,
					tpp, mpp, perpp, fpp);
		}
		int intro = 0;
		do {
			System.out.println("1. Listado");
			System.out.println("2. Buscar Jugador");
			System.out.println("3. Salir");
			intro = sn.nextInt();
			switch (intro) {
			case 1:
				for (int i = 0; i < jugadores.length; i++) {
					jugadores[i].toString();
					System.out.println();
				}
				break;
			case 2:
				do {
					System.out.println("Introduce nombre jugador");
					nombreintro = sc.nextLine();

					for (int i = 0; i < jugadores.length; i++) {
						if (nombreintro.equalsIgnoreCase(jugadores[i].getNombre())) {
							varios++;
							posicion = i;
							existe = true;
						}
					}
					if (existe) {
						if (varios > 1) {
							do {
								System.out.println("Introduce apellido");
								apellidointro = sc.nextLine();
								for (int i = 0; i < jugadores.length; i++) {
									if (apellidointro.equalsIgnoreCase(jugadores[i].getApellidos())) {
										System.out.println(jugadores[i].toString());
										existe = true;
										apellidoexiste = true;
									}
								}
							} while (!apellidoexiste);
						} else {
							System.out.println(jugadores[posicion].toString());
						}
					}
					if (!existe) {
						System.out.println("El jugador no existe, introducelo de nuevo");
					}
				} while (false);
				break;
			}
		} while (intro != 3);
	}
}