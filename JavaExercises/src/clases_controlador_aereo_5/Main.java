package clases_controlador_aereo_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Controlador[] controladores = new Controlador[5];
		Aerolinea[] aerolineas = new Aerolinea[5];
		Avion[] aviones = new Avion[5];
		Vuelo[] vuelos = new Vuelo[5];
		Pasajero[] pasajeros = new Pasajero[5];
		Main.rellenarControladores(controladores);
		Main.rellenarAerolineas(aerolineas);
		Main.rellenarAviones(aviones);
		Main.rellenarVuelos(vuelos);
		int opcion = 0;
		String intro = "";
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		do {
			Main.menu();
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				Main.menu2();
				int opc2 = sn.nextInt();
				switch (opc2) {
				case 1:
					System.out.println("Inserte el nombre de la aerolinea");
					String aero = sc.nextLine();
					if (Main.existeAerolinea(aerolineas, aero)) {
						Main.mostrarAerolina(aerolineas, aero);
					} else {
						System.out.println("Esta linea no existe.");
					}
					break;
				case 2:
					System.out.println("Inserte la matricula de su avion:");
					String matricula = sc.nextLine();
					if (Main.existeAvion(aviones, matricula)) {
						Main.mostrarAvion(aviones, matricula);
					} else {
						System.out.println("Este avi�n no existe");
					}
					break;
				case 3:
					System.out.println("Inserte su numero de vuelo");
					int nVuelo = sn.nextInt();
					if (Main.existeVuelo(vuelos, nVuelo)) {
						Main.mostrarVuelo(vuelos, nVuelo);
					} else {
						System.out.println("No existe este vuelo");
					}
					break;
				case 4:
					System.out.println("Inserte el dni del controlador");
					String dni = sc.nextLine();
					if (Main.existeControlador(controladores, dni)) {
						Main.mostrarControlador(controladores, dni);
					} else {
						System.out.println("No existe el controlador");
					}
					break;

				default:
					System.out.println("Opcion erronea.");
				}
				break;
			case 2:
				Main.menu2();
				int opc3 = sn.nextInt();
				switch (opc3) {
				case 1:
					System.out.println("Inserte el nombre de la aerolinea");
					String aero = sc.nextLine();
					Main.menuAero(aerolineas, aero);
					break;
				case 2:
					String matri = "";
					do {
						System.out.println("Inserte la matricula del avi�n a buscar:");
						matri = sc.nextLine();
					} while (!Main.matriculaCorrecta(matri));
					Main.menuAviones(aviones, matri);
					break;
				case 3:
					int nVuelo = 0;
					do {
						System.out.println("Inserte el n�mero del vuelo.");
						nVuelo = sn.nextInt();
					} while (!Main.nVueloCorrecto(nVuelo));
					Main.menuVuelo(vuelos, nVuelo);
					break;
				case 4:
					String dni = "";
					do {
						System.out.println("Introduzca el dni del controlador");
						dni = sc.nextLine();
					} while (!Main.dniTrue(dni));
					Main.menuControlador(controladores, dni);
					break;
				default:
					System.out.println("Opcion erronea.");
				}
				break;
			case 3:
				Main.menu2();
				int opc4 = sn.nextInt();
				switch (opc4) {
				case 1:
					Main.showInfoAero(aerolineas);
					break;
				case 2:
					Main.showInfoAvion(aviones);
					break;
				case 3:
					Main.showInfoVuelo(vuelos);
					break;
				case 4:
					Main.showInfoController(controladores);
					break;
				default:
					System.out.println("Opcion erronea.");
				}
				break;
			case 4:
				System.out.println("Introduce matricula avion");
				intro = sc.nextLine();
				if (Main.existeAvion(aviones, intro) == true) {
					System.out.println("Introduce cuantos litros quieres sumar");
					int deposito = sn.nextInt();
					Main.cambiarAvion(aviones, intro, deposito);
				} else {
					System.out.println("Avion no existe");
				}
				break;
			case 5:
				System.out.println("Introduce DNI controlador");
				intro = sc.nextLine();
				if (Main.existeControlador(controladores, intro)) {
					System.out.println("Introduce cuanta experiencia quieres sumar");
					int exp = sn.nextInt();
				} else {
					System.out.println("Controlador no existe");
				}
				break;
			case 6:
				System.out.println("Introduce matricula avion");
				intro = sc.nextLine();
				if (Main.existeAvion(aviones, intro) == true) {
					int capacidad = sn.nextInt();
					System.out.println("Introduce cuantos pasajeros quieres sumar");
					Main.cambiarCapacidadAvion(aviones, intro, capacidad);
				} else {
					System.out.println("Avion no existe");
				}
			case 7:
				System.out.println("Hasta pronto!");
				break;
			default:
				System.out.println("Opcion erronea.");
			}
		} while (opcion != 7);
	}

	public static void cambiarAvion(Avion[] aviones, String intro, int deposito) {
		System.out.println("Introduce nueva capacidad deposito");
		for (int i = 0; i < aviones.length; i++) {
			if (aviones[i].getMatricula().equalsIgnoreCase(intro)) {
				System.out.println("Antes: " + aviones[i].mostrarDatos());
				aviones[i].setCap_deposito(aviones[i].getCap_deposito() + deposito);
				System.out.println("Despues: " + aviones[i].mostrarDatos());
			}
		}
	}

	public static void cambiarControlador(Controlador[] controladores, String intro, int exp) {
		for (int i = 0; i < controladores.length; i++) {
			if (controladores[i].getDni().equalsIgnoreCase(intro)) {
				System.out.println("Antes: " + controladores[i].mostrarDatos());
				controladores[i].setAnosexp(controladores[i].getAnosexp() + exp);
				System.out.println("Despues: " + controladores[i].mostrarDatos());
			}
		}
	}

	public static void cambiarCapacidadAvion(Avion[] aviones, String intro, int capacidad) {
		for (int i = 0; i < aviones.length; i++) {
			if (aviones[i].getMatricula().equalsIgnoreCase(intro)) {
				System.out.println("Antes: " + aviones[i].mostrarDatos());
				aviones[i].setCap_pasajeros(aviones[i].getCap_pasajeros() + capacidad);
				System.out.println("Despues: " + aviones[i].mostrarDatos());
			}
		}
	}

	public static void rellenarControladores(Controlador[] nArray) {
		nArray[0] = new Controlador("Pablo", "Garcia", "51900041M", 1995, 9, 90);
		nArray[1] = new Controlador("Pablo", "Costa", "89753614Y", 1995, 5, 100);
		nArray[2] = new Controlador("Antonio", "Andrino", "15233369P", 1999, 15, 92);
		nArray[3] = new Controlador("Jesus", "Prados", "81373646A", 1995, 2, 100);
		nArray[4] = new Controlador("Luc�a", "Hernandez", "91562374U", 1978, 20, 90);
	}

	public static void rellenarAerolineas(Aerolinea[] nArray) {
		nArray[0] = new Aerolinea("PabloAir", "Espa�a");
		nArray[1] = new Aerolinea("RyanAir", "Irlanda");
		nArray[2] = new Aerolinea("Qatar Air Lines", "Qatar");
		nArray[3] = new Aerolinea("Iberia", "Espa�a");
		nArray[4] = new Aerolinea("EasyJet", "UK");

	}

	public static void rellenarAviones(Avion[] nArray) {
		nArray[0] = new Avion("AirBus", "150", 1200, 150, "9876LKJ");
		nArray[1] = new Avion("Boeing", "747", 5000, 180, "1234JKL");
		nArray[2] = new Avion("AirBus", "250", 1500, 250, "3456POI");
		nArray[3] = new Avion("Boeing", "747", 5000, 370, "9875LUV");
		nArray[4] = new Avion("AirBus", "2000", 7000, 600, "7566GYU");
	}

	public static void rellenarVuelos(Vuelo[] nArray) {
		String pasajeros[] = { "Juan", "Javier" };
		nArray[0] = new Vuelo(702563, "Medellin", 450.0, pasajeros);
		nArray[1] = new Vuelo(702564, "Londer", 98.0, pasajeros);
		nArray[2] = new Vuelo(702565, "Dublin", 56.0, pasajeros);
		nArray[3] = new Vuelo(702566, "Barcelona", 40.0, pasajeros);
		nArray[4] = new Vuelo(702567, "Roma", 120.0, pasajeros);
	}

	public static void rellenarPasajeros(Pasajero[] pasajeros) {
		String nombres[] = { "Javier", "Javier", "Javier", "Javier", "Javier" };
		String apellidos[] = { "Javier", "Javier", "Javier", "Javier", "Javier" };
		String dni[] = { "12547485A", "12547485A", "12547485A", "12547485A", "12547485A" };
		int edad[] = { 2, 3, 4, 2, 1 };
		String provincia[] = { "Madrid", "Madrid", "Madrid", "Madrid", "Madrid" };
		for (int i = 0; i < pasajeros.length; i++) {
			pasajeros[i] = new Pasajero(nombres[i], apellidos[i], dni[i], edad[i], provincia[i]);
		}
	}

	public static boolean existeControlador(Controlador[] nArray, String dni) {
		boolean existe = false;
		for (int i = 0; i < nArray.length; i++) {
			if (dni.equalsIgnoreCase(nArray[i].getDni())) {
				existe = true;
			}
		}
		return existe;
	}

	public static boolean existeAerolinea(Aerolinea[] nArray, String nombre) {
		boolean existe = false;
		for (int i = 0; i < nArray.length; i++) {
			if (nombre.equalsIgnoreCase(nArray[i].getNombre())) {
				existe = true;
			}
		}
		return existe;
	}

	public static boolean existeAvion(Avion[] nArray, String matricula) {
		boolean existe = false;
		for (int i = 0; i < nArray.length; i++) {
			if (matricula.equalsIgnoreCase(nArray[i].getMatricula())) {
				existe = true;
			}
		}
		return existe;
	}

	public static boolean existeVuelo(Vuelo[] nArray, int nVuelo) {
		boolean existe = false;
		for (int i = 0; i < nArray.length; i++) {
			if (nVuelo == nArray[i].getN_vuelo()) {
				existe = true;
			}
		}
		return existe;
	}

	public static void menu() {
		System.out.println("Seleccionar Opción: ");
		System.out.println("1. Buscar");
		System.out.println("2. Modificar");
		System.out.println("3. Mostrar Datos");
		System.out.println("4. Aumentar capacidad deposito avion");
		System.out.println("5. Sumar puntos experiencia controlador");
		System.out.println("6. Aumentar capacidad pasajeros de avion");
		System.out.println("7. Salir");

	}

	public static void menu2() {
		System.out.println("Selecciones entidad a buscar:");
		System.out.println("1. Aerolonea");
		System.out.println("2. Avion");
		System.out.println("3. Vuelo");
		System.out.println("4. Controlador");

	}

	public static void mostrarAerolina(Aerolinea[] nArray, String nombre) {
		for (int i = 0; i < nArray.length; i++) {
			if (nombre.equalsIgnoreCase(nArray[i].getNombre())) {
				System.out.println(nArray[i].toString());
			}
		}
	}

	public static void mostrarAvion(Avion[] nArray, String matricula) {
		for (int i = 0; i < nArray.length; i++) {
			if (matricula.equalsIgnoreCase(nArray[i].getMatricula())) {
				System.out.println(nArray[i].toString());
			}
		}
	}

	public static void mostrarVuelo(Vuelo[] nArray, int nVuelo) {
		for (int i = 0; i < nArray.length; i++) {
			if (nVuelo == nArray[i].getN_vuelo()) {
				System.out.println(nArray[i].toString());
			}
		}
	}

	public static void mostrarControlador(Controlador[] nArray, String dni) {
		for (int i = 0; i < nArray.length; i++) {
			if (dni.equalsIgnoreCase(nArray[i].getDni())) {
				System.out.println(nArray[i].toString());
			}
		}
	}

	public static boolean matriculaCorrecta(String matricula) {
		boolean correct = false;
		String abc = "abcdefghijklmn�opqrstuvwxyzABCDEFGHIJKLMN�OPQRSTUVWXYZ";
		String num = "0123456789";
		int cond = 0;

		if (matricula.length() == 7) {
			cond++;
		} else {
			System.out.println(
					"Matr�cula demasiado corta, tiene que tener 7 car�cteres, los 4 primeros n�meros y los 3 �tlimos letras.");
		}
		if (cond == 1) {
			for (int i = 1; i <= 4; i++) {
				if (num.contains(matricula.substring(i - 1, i))) {
					cond++;
				}
			}
			if (cond == 5) {
				for (int i = 5; i <= 7; i++) {
					if (abc.contains(matricula.substring(i - 1, i))) {
						cond++;
					}
				}
				if (cond == 8) {
					correct = true;
				}
			} else {
				System.out.println("Los 4 primeros car�cteres no son n�meros.");
			}
		}
		return correct;
	}

	public static boolean nVueloCorrecto(int nVuelo) {
		boolean correcto = false;
		if (Integer.toString(nVuelo).matches("[0-9]{1,}")) {
			correcto = true;
		} else {
			System.out.println("El n�mero est� mal introducido tienen que ser n�meros todos ellos.");
		}
		return correcto;
	}

	public static boolean dniTrue(String dni) {
		boolean correcto = false;
		if (dni.matches("^[0-9]{8,8}[a-zA-Z]{1}$")) {
			correcto = true;
		} else {
			System.out.println("Formato de DNI Incorrecto");
		}
		return correcto;
	}

	public static void showInfoAero(Aerolinea[] nArray) {
		for (int i = 0; i < nArray.length; i++) {
			System.out.println(nArray[i].toString());
			System.out.println();
		}
	}

	public static void showInfoAvion(Avion[] nArray) {
		for (int i = 0; i < nArray.length; i++) {
			System.out.println(nArray[i].toString());
			System.out.println();
		}
	}

	public static void showInfoVuelo(Vuelo[] nArray) {
		for (int i = 0; i < nArray.length; i++) {
			System.out.println(nArray[i].toString());
			System.out.println();
		}
	}

	public static void showInfoController(Controlador[] nArray) {
		for (int i = 0; i < nArray.length; i++) {
			System.out.println(nArray[i].toString());
			System.out.println();
		}
	}

	public static void menuAero(Aerolinea[] nArray, String aero) {
		boolean existe = false;
		for (int i = 0; i < nArray.length; i++) {
			if (aero.equalsIgnoreCase(nArray[i].getNombre())) {
				existe = true;
				int opc = 0;
				Scanner sc = new Scanner(System.in);
				Scanner sn = new Scanner(System.in);
				System.out.println("Elija el numero de opcion que quiere modificar: \r\n" + "1.- Nombre. \r\n"
						+ "2.- Pais de origen.");
				opc = sn.nextInt();
				switch (opc) {
				case 1:
					System.out.println("Introduzca el nuevo nombre:");
					String newNom = sc.nextLine();
					if (Main.existeAerolinea(nArray, newNom)) {
						System.out.println("Esta aerolinea ya existe.");
					} else {
						nArray[i].setNombre(newNom);
					}
					break;
				case 2:
					System.out.println("Introduzca el nuevo pais de origen:");
					String newPais = sc.nextLine();
					nArray[i].setP_origen(newPais);
					break;

				default:
					System.out.println("Opcion elegida incorrecta.");
				}
			}
		}
		if (existe == false) {
			System.out.println("Esta aerolinea no existe.");
		}
	}

	public static void menuAviones(Avion[] nArray, String matricula) {
		boolean existe = false;
		for (int i = 0; i < nArray.length; i++) {
			if (matricula.equalsIgnoreCase(nArray[i].getMatricula())) {
				existe = true;
				int opc = 0;
				Scanner sc = new Scanner(System.in);
				Scanner sn = new Scanner(System.in);
				System.out.println("Elija el numero de opcion que quiere modificar: \r\n" + "1.- Marca. \r\n"
						+ "2.- Modelo. \r\n" + "3.- Capacidad del deposito. \r\n" + "4.- Capacidad de viajeros. \r\n"
						+ "5.- Matricula.");
				opc = sn.nextInt();
				switch (opc) {
				case 1:
					System.out.println("Introduzca la nueva marca:");
					String newMarca = sc.nextLine();
					nArray[i].setMarca(newMarca);
					break;
				case 2:
					System.out.println("Introduzca el nuevo modelo:");
					String newModelo = sc.nextLine();
					nArray[i].setModelo(newModelo);
					break;
				case 3:
					String newDepo = "";
					do {
						System.out.println("Introduzca la nueva capacidad del deposito:");
						newDepo = sc.nextLine();
						if (!newDepo.matches("^[1-9][0-9]{2,}.?")) {
							System.out.println(
									"El deposito tiene que ser un numero mayor de 2 digitos y puede contener solo un punto representando decimales.");
						}
					} while (!newDepo.matches("^[1-9][0-9]{1,}.?"));
					nArray[i].setCap_deposito(Integer.parseInt(newDepo));
					break;
				case 4:
					String newViajeros = "";
					do {
						System.out.println("Introduzca la nueva capacidad de viajeros del avion");
						newViajeros = sc.nextLine();
						if (!newViajeros.matches("^[1-9][0-9]{1,}")) {
							System.out.println(
									"La capacidad de viajeros solo puede ser un numero entero con 2 digitos o m�s");
						}
					} while (!newViajeros.matches("^[1-9][0-9]{1,}"));
					nArray[i].setCap_pasajeros(Integer.parseInt(newViajeros));
					break;
				case 5:
					String newMatricula = "";
					do {
						System.out.println("Introduzca la nueva matr�cula:");
						newMatricula = sc.nextLine();
						if (Main.existeAvion(nArray, newMatricula)) {
							System.out.println("Esta matr�cula ya pertenece a algun avi�n");
						} else {
							if (Main.matriculaCorrecta(newMatricula)) {
								nArray[i].setMatricula(newMatricula);
							} else {
								System.out.println("Introduzca una matr�cula correcta.");
							}
						}
					} while (!Main.matriculaCorrecta(newMatricula));
					break;
				default:
					System.out.println("opcion incorrecta.");
				}
			}
		}
		if (existe == false) {
			System.out.println("Este avi�n no existe.");
		}
	}

	public static void menuVuelo(Vuelo[] nArray, int nVuelo) {
		boolean existe = false;
		for (int i = 0; i < nArray.length; i++) {
			if (nVuelo == nArray[i].getN_vuelo()) {
				existe = true;
				int opc = 0;
				Scanner sc = new Scanner(System.in);
				Scanner sn = new Scanner(System.in);
				System.out.println("Elija el numero de opcion que quiere modificar: \r\n" + "1.- Numero de vuelo. \r\n"
						+ "2.- Destino.\r\n" + "3.- Precio.");
				opc = sn.nextInt();
				switch (opc) {
				case 1:
					int newNumVuelo = 0;
					do {
						System.out.println("Introduzca el nuevo numero de vuelo.");
						newNumVuelo = sn.nextInt();
					} while (!Main.nVueloCorrecto(newNumVuelo));
					if (Main.existeVuelo(nArray, newNumVuelo)) {
						System.out.println("Este numero de vuelo ya corresponde a otro.");
					} else {
						nArray[i].setN_vuelo(newNumVuelo);
					}
					break;
				case 2:
					System.out.println("Introduzca el nuevo destino");
					String newDestino = sc.nextLine();
					nArray[i].setC_destino(newDestino);
					break;
				case 3:
					String newPrecio = "";
					do {
						System.out.println("Introduzca el nuevo precio");
						newPrecio = sc.nextLine();
					} while (!newPrecio.matches("^[1-9][0-9]{0,}.?[0-9]{0,}"));
					nArray[i].setPrecio(Double.parseDouble(newPrecio));
					break;
				default:
					System.out.println("Opcion incorrecta");
				}
			}
		}
		if (!existe) {
			System.out.println("El numero de vuelo no corresponde a ninguno de los guardados.");
		}
	}

	public static void menuControlador(Controlador[] nArray, String dni) {
		boolean existe = false;
		for (int i = 0; i < nArray.length; i++) {
			if (dni.equalsIgnoreCase(nArray[i].getDni())) {
				existe = true;
				int opc = 0;
				Scanner sc = new Scanner(System.in);
				Scanner sn = new Scanner(System.in);
				System.out.println("Elija el numero de opcion que quiere modificar: \r\n" + "1.- Nombre. \r\n"
						+ "2.- Apellido. \r\n" + "3.- DNI. \r\n" + "4.- A�o nacimiento. \r\n"
						+ "5.- A�os de experiencia.\r\n" + "6.- Nivel de destreza.");
				opc = sn.nextInt();
				switch (opc) {
				case 1:
					System.out.println("Introduzca el nuevo nombre:");
					String newNom = sc.nextLine();
					nArray[i].setNombre(newNom);
					break;
				case 2:
					System.out.println("Introduzca el nuevo apellido:");
					String newApe = sc.nextLine();
					nArray[i].setApellidos(newApe);
					break;
				case 3:
					String newDNI = "";
					do {
						System.out.println("Introduzca el nuevo DNI:");
						newDNI = sc.nextLine();
					} while (!Main.dniTrue(newDNI));
					if (Main.existeControlador(nArray, newDNI)) {
						System.out.println("Este DNI ya esta asociado a un controlador.");
					} else {
						nArray[i].setDni(newDNI);
					}
					break;
				case 4:
					int newNac = 0;
					do {
						do {
							System.out.println("Introduzca el nuevo a�o de nacimiento:");
							newNac = sn.nextInt();
						} while (!Integer.toString(newNac).matches("[0-9]{4,4}"));
					} while ((newNac > 2001) || (newNac) < 1900);
					nArray[i].setNacimiento(newNac);
					break;
				case 5:
					String newEXP = "";
					do {
						do {
							System.out.println("Introduzca los nuevos a�os de experiencia:");
							newEXP = sc.nextLine();
						} while (!newEXP.matches("[0-9]{1,2}"));
					} while ((Integer.parseInt(newEXP) > 99) || (Integer.parseInt(newEXP) < 0));
					nArray[i].setAnosexp(Integer.parseInt(newEXP));
					break;
				case 6:
					String newDestreza = "";
					do {
						do {
							System.out.println("Introduzca el nuevo nivel de destreza:");
							newDestreza = sc.nextLine();
						} while (!newDestreza.matches("[0-9]{1,3}"));
					} while ((Integer.parseInt(newDestreza) > 100) || (Integer.parseInt(newDestreza) < 0));
					nArray[i].setDestreza(Integer.parseInt(newDestreza));
					break;
				default:
					System.out.println("Opcion incorrecta.");
				}
			}
		}
		if (!existe) {
			System.out.println("El controlador solicitado no existe.");
		}
	}

}
