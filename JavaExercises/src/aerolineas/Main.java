package aerolineas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
		ArrayList<Avion> aviones = new ArrayList<Avion>();
		ArrayList<Comandante> comandantes = new ArrayList<Comandante>();
		ArrayList<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
		int intro = 0;
		do {
			Main.menu();
			intro = sc.nextInt();
			switch (intro) {
			case 1:
				Main.insertarAvion(aviones);
				break;
			case 2:
				Main.insertarComandante(comandantes);
				break;
			case 3:
				Main.insertarAeropuerto(aeropuertos, aviones);
				break;
			case 4:
				Main.insertarPasajero(pasajeros);
				break;
			case 5:
				Main.insertarVuelo(vuelos, aviones, pasajeros, aeropuertos);
				break;
			case 6:
				Main.mostrarDatosTodosAviones(aviones);
				break;
			case 7:
				Main.mostrarDatosTodosComandantes(comandantes);
				break;
			case 8:
				Main.mostrarDatosTodosAeropuertos(aeropuertos);
				break;
			case 9:
				Main.mostrarDatosTodosPasajeros(pasajeros);
				break;
			case 10:
				Main.mostrarDatosTodosVuelos(vuelos);
				break;
			case 11:
				System.out.println("Adios!");
				break;

			}
		} while (intro != 11);
	}

	public static void menu() {
		System.out.println(
				"1. Insertar 1 Avión en el arrayList de aviones.(No permitas que se inserten aviones con la misma matrícula)\n"
						+ "2. Insertar 1 Comandante en el arrayList de comandantes.(No permitas que se inserten comandantes con el mismo dni)\n"
						+ "3. Insertar 1 Aeropuerto en el arrayList de aeropuertos.(No permitas que se inserten aeropuertos con el mismo código de aeropuerto)\n"
						+ "4. Insertar 1 Pasajero en el arrayList de pasajeros.(No permitas que se inserten pasajeros con el mismo dni)\n"
						+ "5. Insertar 1 Vuelo en el arrayList de vuelos.(No permitas que se inserten vuelos con el mismo código)\n"
						+ "6. Mostrar datos de todos los aviones.\n" + "7. Mostrar datos de todos los Comandantes.\n"
						+ "8. Mostrar datos de todos los Aeropuertos.\n" + "9. Mostrar datos de todos los Pasajeros.\n"
						+ "10. Mostrar datos de todos los Vuelos.\n" + "11. Salir");
	}

	public static void mostrarDatosTodosAviones(ArrayList<Avion> aviones) {
		for (int i = 0; i < aviones.size(); i++) {
			System.out.println(aviones.get(i).toString());
		}
	}

	public static void mostrarDatosTodosComandantes(ArrayList<Comandante> comandantes) {
		for (int i = 0; i < comandantes.size(); i++) {
			System.out.println(comandantes.get(i).toString());
		}
	}

	public static void mostrarDatosTodosAeropuertos(ArrayList<Aeropuerto> aeropuertos) {
		for (int i = 0; i < aeropuertos.size(); i++) {
			System.out.println(aeropuertos.get(i).toString());
		}
	}

	public static void mostrarDatosTodosPasajeros(ArrayList<Pasajero> pasajeros) {
		for (int i = 0; i < pasajeros.size(); i++) {
			System.out.println(pasajeros.get(i).toString());
		}
	}

	public static void mostrarDatosTodosVuelos(ArrayList<Vuelo> vuelos) {
		for (int i = 0; i < vuelos.size(); i++) {
			System.out.println(vuelos.get(i).toString());
		}
	}

	public static Boolean matriculaRepetidaAvion(ArrayList<Avion> aviones, String matricula) {
		Boolean repetido = false;
		for (int i = 0; i < aviones.size(); i++) {
			if (matricula.equalsIgnoreCase(aviones.get(i).getMatricula())) {
				repetido = true;
			}
		}
		if (!repetido) {
			return false;
		} else {
			return true;
		}
	}

	public static Boolean dniRepetidoComandante(ArrayList<Comandante> comandantes, String dni) {
		Boolean repetido = false;
		for (int i = 0; i < comandantes.size(); i++) {
			if (dni.equalsIgnoreCase(comandantes.get(i).getDni())) {
				repetido = true;
			}
		}
		if (!repetido) {
			return false;
		} else {
			return true;
		}
	}

	public static Boolean codigoAeropuertoRepetido(ArrayList<Aeropuerto> aeropuertos, int codigo) {
		Boolean repetido = false;
		for (int i = 0; i < aeropuertos.size(); i++) {
			if (codigo == aeropuertos.get(i).getCodigo_aeropuerto()) {
				repetido = true;
			}
		}
		if (!repetido) {
			return false;
		} else {
			return true;
		}
	}

	public static Boolean dniPasajeroRepetido(ArrayList<Pasajero> pasajeros, String dni) {
		Boolean repetido = false;
		for (int i = 0; i < pasajeros.size(); i++) {
			if (dni.equalsIgnoreCase(pasajeros.get(i).getDni())) {
				repetido = true;
			}
		}
		if (!repetido) {
			return false;
		} else {
			return true;
		}
	}

	public static Boolean codigoVueloRepetido(ArrayList<Vuelo> vuelos, int codigo) {
		Boolean repetido = false;
		for (int i = 0; i < vuelos.size(); i++) {
			if (codigo == vuelos.get(i).getCod_vuelo()) {
				repetido = true;
			}
		}
		if (!repetido) {
			return false;
		} else {
			return true;
		}
	}

	public static void insertarVuelo(ArrayList<Vuelo> vuelos, ArrayList<Avion> aviones, ArrayList<Pasajero> pasajeros,
			ArrayList<Aeropuerto> aeropuertos) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce codigo vuelo");
		int codVuelo = sn.nextInt();
		if (Main.codigoVueloRepetido(vuelos, codVuelo) == true) {
			System.out.println("El vuelo ya existe");
		} else {
			vuelos.add(new Vuelo(codVuelo, aviones.get(0), pasajeros, aeropuertos.get(0), aeropuertos.get(0)));
		}
	}

	public static void insertarPasajero(ArrayList<Pasajero> pasajeros) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce apellidos");
		String apellidos = sc.nextLine();
		System.out.println("Introduce telefono");
		int telefono = sn.nextInt();
		System.out.println("Introduce dni");
		String dni = sc.nextLine();
		System.out.println("Introduce edad");
		int edad = sn.nextInt();
		if (Main.dniPasajeroRepetido(pasajeros, dni) == true) {
			System.out.println("El pasajero ya existe");
		} else {
			pasajeros.add(new Pasajero(nombre, apellidos, telefono, dni, edad));
		}
	}

	public static void insertarAeropuerto(ArrayList<Aeropuerto> aeropuertos, ArrayList<Avion> aviones) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce ciudad");
		String ciudad = sc.nextLine();
		System.out.println("Introduce codigo aeropuerto");
		int codigo = sn.nextInt();
		if (Main.codigoAeropuertoRepetido(aeropuertos, codigo) == true) {
			System.out.println("Codigo Aeropuerto ya existe");
		} else {
			aeropuertos.add(new Aeropuerto(nombre, ciudad, codigo, aviones));
			System.out.println("Aeropuerto añadido");
		}
	}

	public static void insertarComandante(ArrayList<Comandante> comandantes) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce apellidos");
		String apellidos = sc.nextLine();
		System.out.println("Introduce telefono");
		int telefono = sn.nextInt();
		System.out.println("Introduce DNI");
		String dni = sc.nextLine();
		System.out.println("Introduce edad");
		int edad = sn.nextInt();
		System.out.println("Introduce rango");
		int rango = sn.nextInt();
		if (Main.dniRepetidoComandante(comandantes, dni) == true) {
			System.out.println("El dni ya existe");
		} else {
			comandantes.add(new Comandante(nombre, apellidos, telefono, dni, edad, rango));
			System.out.println("Comantante añadido");
		}
	}

	public static void insertarAvion(ArrayList<Avion> aviones) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Scanner sx = new Scanner(System.in);
		System.out.println("Introduce modelo");
		String modelo = sc.nextLine();
		System.out.println("Introduce pasajeros");
		int pasajeros = sn.nextInt();
		System.out.println("Introduce matricula");
		String matricula = sc.nextLine();
		System.out.println("Introduce capacidad deposito");
		double deposito = sx.nextDouble();
		System.out.println("Introduce año");
		int año = sn.nextInt();
		System.out.println("Introduce comandante");
		String comandante = sc.nextLine();
		if (Main.matriculaRepetidaAvion(aviones, matricula) == true) {
			System.out.println("Matricula repetida");
		} else {
			aviones.add(new Avion(modelo, pasajeros, matricula, deposito, año, comandante));
			System.out.println("Avion añadido");
		}
	}
}
