package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Desempleados_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String ruta = "usuarios.txt";
		File fichero = new File(ruta);
		ArrayList<Empleados> empleados = new ArrayList<Empleados>();
		Desempleados_main.rellenar(empleados, ruta);
		int intro = 0;
		do {
			menu();
			intro = sn.nextInt();
			switch (intro) {
			case 1:
				System.out.println(empleados.size());
				break;
			case 2:
				Desempleados_main.hombres(empleados);
				Desempleados_main.mujeres(empleados);
				break;
			case 3:
				for (int i = 0; i < Desempleados_main.empleadoscasados(empleados).size(); i++) {
					System.out.println(Desempleados_main.empleadoscasados(empleados).get(i).toString());
				}
				break;
			case 4:
				for (int i = 0; i < Desempleados_main.saludexcelente(empleados).size(); i++) {
					System.out.println(Desempleados_main.saludexcelente(empleados).get(i).toString());
				}
				break;
			case 5:
				System.out.println("Introduce telefono movil");
				String movil = sc.nextLine();
				Desempleados_main.eliminar(empleados, movil);
				break;
			case 6:

				break;
			}
		} while (intro != 7);
	}

	public static void eliminar(ArrayList<Empleados> empleados, String movil) {
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getMovil().equalsIgnoreCase(movil)) {
				empleados.remove(i);
				System.out.println("Empleado eliminado");
			}
		}
	}

	public static ArrayList<Empleados> saludexcelente(ArrayList<Empleados> empleados) {
		ArrayList<Empleados> saludexcelente = new ArrayList<Empleados>();
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getSalud().equalsIgnoreCase("Excelente")) {
				saludexcelente.add(empleados.get(i));
			}
		}
		return saludexcelente;
	}

	public static ArrayList<Empleados> empleadoscasados(ArrayList<Empleados> empleados) {
		ArrayList<Empleados> empleadoscasados = new ArrayList<Empleados>();
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getEstado_civil().equalsIgnoreCase("Casado/a")) {
				empleadoscasados.add(empleados.get(i));
			}
		}
		return empleadoscasados;
	}

	public static void rellenar(ArrayList<Empleados> empleados, String ruta) {
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			linea = br.readLine();
			while (linea != null) {
				linea = linea.replaceAll("\"", "");
				String[] lineasplit = linea.split(";");
				Empleados emple = new Empleados(lineasplit[0], lineasplit[1], lineasplit[2], lineasplit[3],
						lineasplit[4], lineasplit[5], lineasplit[6], lineasplit[7], lineasplit[8], lineasplit[9],
						lineasplit[10], lineasplit[11], lineasplit[12], lineasplit[13], lineasplit[14], lineasplit[15],
						lineasplit[16], lineasplit[17], lineasplit[18], lineasplit[19], lineasplit[20], lineasplit[21],
						lineasplit[22], lineasplit[23], lineasplit[24], lineasplit[25], lineasplit[26], lineasplit[27],
						lineasplit[28], lineasplit[29], lineasplit[30], lineasplit[31], lineasplit[32], lineasplit[33]);
				empleados.add(emple);
				linea = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int mujeres(ArrayList<Empleados> empleados) {
		int contador = 0;
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getSexo().equalsIgnoreCase("mujer")) {
				contador++;
			}
		}
		return contador;
	}

	public static int hombres(ArrayList<Empleados> empleados) {
		int contador = 0;
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getSexo().equalsIgnoreCase("hombre")) {
				contador++;
			}
		}
		return contador;
	}

	public static void menu() {
		System.out.println("1. Mostrar por pantalla el Nº de usuarios totales.");
		System.out.println("2. Mostrar por pantalla el Nº de usuarios hombre y el nº de usuarios mujer.");
		System.out.println("3. Mostrar por pantalla los datos de los usuarios que estén casados.");
		System.out.println("4. Mostrar por pantalla el nombre y apellidos de los usuarios con salud “excelente”");
		System.out.println("5. Eliminar un usuario por id.");
		System.out.println("6. Modificar un dato de un usuario.");
		System.out.println("7. Salir");
	}
}
