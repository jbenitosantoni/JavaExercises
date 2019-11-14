package clases_controlador_aereo_cambiosprofe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controlador[] controladores = new Controlador[5];
		Avion[] aviones = new Avion[5];
		Aerolinea[] aerolineas = new Aerolinea[5];
		Vuelo[] vuelos = new Vuelo[5];
		int opc = 0, opc2 = 0;
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Main.rellenarAerolineas(aerolineas);
		Main.rellenarAviones(aviones);
		Main.rellenarControladres(controladores);
		Main.rellenarVuelos(vuelos);
		do {
			Main.mostrarMenu();
			opc = sn.nextInt();
			switch (opc) {
			case 1:
				Main.mostrarMenu2();
				opc2 = sn.nextInt();
				switch (opc2) {
				case 1:
					System.out.println("Introduzca nombre de aerolinea a buscar.");
					String aero = sc.nextLine();
					if (Main.existeAerolinea(aerolineas, aero) == true) {
						Main.mostrarDatosAerolinea(aerolineas, aero);
					} else {
						System.out.println("Esa aerolinea no existe.");
					}

					break;
				case 2:
					System.out.println("Introduzca matricula avion a buscar");
					String avion = sc.nextLine();
					if (Main.existeAvion(aviones, avion) == true) {
						Main.mostrarDatosAvion(aviones, avion);
					} else {
						System.out.println("Esa matricula no existe.");
					}

					break;
				case 3:
					System.out.println("Introduce DNI controlador");
					String dni = sc.nextLine();
					if (Main.existeControlador(controladores, dni) == true) {
						Main.mostrarDatosControlador(controladores, dni);
					} else {
						System.out.println("Ese DNI no existe.");
					}
					break;
				case 4:
					System.out.println("Introduce numero vuelo");
					int num_vuelo = sn.nextInt();
					if (Main.existeVuelo(vuelos, num_vuelo) == true) {
						Main.mostrarDatosVuelo(vuelos, num_vuelo);
					} else {
						System.out.println("Ese vuelo no existe.");
					}
					break;
				default:
					System.out.println("Opcion incorrecta.");
				}

				break;
			default:
				System.out.println("Opcion incorrecta.");
			}
		} while (opc != 2);

	}

	static void mostrarDatosAerolinea(Aerolinea[] aerolineas, String nombre) {
		for (int i = 0; i < aerolineas.length; i++) {
			if (nombre.equalsIgnoreCase(aerolineas[i].getNombre())) {
				System.out.println(aerolineas[i].mostrarDatos());
			}
		}
	}

	static void mostrarDatosAvion(Avion[] aviones, String avion) {
		for (int i = 0; i < aviones.length; i++) {
			if (avion.equalsIgnoreCase(aviones[i].getMatricula())) {
				System.out.println(aviones[i].mostrarDatos());
			}
		}
	}

	static void mostrarDatosControlador(Controlador[] controladores, String dni) {
		for (int i = 0; i < controladores.length; i++) {
			if (controladores[i].getDni().equalsIgnoreCase(dni)) {
				System.out.println(controladores[i].mostrarDatos());
			}
		}
	}

	static void mostrarDatosVuelo(Vuelo[] vuelos, int num_vuelo) {

	}

	static void mostrarMenu() {
		System.out.println("Selecciones Opci�n: ");
		System.out.println("1. Buscar");
		System.out.println("2. Salir");
	}

	static void mostrarMenu2() {
		System.out.println("Selecciones entidad a buscar:");
		System.out.println("1. Aerol�nea");
		System.out.println("2. Avi�n");
		System.out.println("3. Vuelo");
		System.out.println("4. Controlador");

	}

	static boolean existeControlador(Controlador[] controladores, String dni) {
		boolean existe = false;
		for (int i = 0; i < controladores.length; i++) {
			if (dni.equalsIgnoreCase(controladores[i].getDni())) {
				existe = true;
			}
		}
		return existe;
	}

	static boolean existeAvion(Avion[] aviones, String matricula) {
		boolean existe = false;
		for (int i = 0; i < aviones.length; i++) {
			if (matricula.equalsIgnoreCase(aviones[i].getMatricula())) {
				existe = true;
			}
		}
		return existe;
	}

	static boolean existeAerolinea(Aerolinea[] aerolineas, String nombre) {
		boolean existe = false;
		for (int i = 0; i < aerolineas.length; i++) {
			if (nombre.equalsIgnoreCase(aerolineas[i].getNombre())) {
				existe = true;
			}
		}
		return existe;
	}

	static boolean existeVuelo(Vuelo[] vuelos, int num_vuelo) {
		boolean existe = false;
		for (int i = 0; i < vuelos.length; i++) {
			if (num_vuelo == vuelos[i].getN_vuelo()) {
				existe = true;
			}
		}
		return existe;
	}

	static void rellenarControladres(Controlador[] controladores) {
		controladores[0] = new Controlador("Steve", "Nash", "0983452F", 1980, 10, 67);
		controladores[1] = new Controlador("Richard", "Sully", "0445526A", 1969, 23, 69);
		controladores[2] = new Controlador("Jhon", "Mcmillan", "7788767H", 1990, 17, 34);
		controladores[3] = new Controlador("Anthony", "Davis", "0887767J", 1976, 21, 89);
		controladores[4] = new Controlador("Jerry", "West", "873323G", 1965, 31, 90);
	}

	static void rellenarAviones(Avion[] aviones) {
		aviones[0] = new Avion("Boeing", "747", 4500, 250, "UP-C8504");
		aviones[1] = new Avion("Lockheed Martin", "F-22", 2000, 2, "ZA-R3424");
		aviones[2] = new Avion("Airbus", "A380", 4325, 266, "PC-X8475");
		aviones[3] = new Avion("Airbus", "A370", 4000, 250, "PC-J4504");
		aviones[4] = new Avion("Boeing", "777", 3800, 300, "XS-Q8994");
	}

	static void rellenarVuelos(Vuelo[] vuelos) {
		vuelos[0] = new Vuelo(234, "Medellin", 230.8);
		vuelos[1] = new Vuelo(654, "Bogota", 1250.0);
		vuelos[2] = new Vuelo(164, "Maiami", 688.0);
		vuelos[3] = new Vuelo(865, "Tokyo", 2000.0);
		vuelos[4] = new Vuelo(935, "Bruselas", 56.0);
	}

	static void rellenarAerolineas(Aerolinea[] aerolineas) {
		aerolineas[0] = new Aerolinea("Iberia", "Espa�a");
		aerolineas[1] = new Aerolinea("AirEuropa", "Francia");
		aerolineas[2] = new Aerolinea("EasyJet", "Reino Unido");
		aerolineas[3] = new Aerolinea("Turkish Airlines", "Turqu�a");
		aerolineas[4] = new Aerolinea("Fly Emirates", "Emiratos �rabes");
	}
}
