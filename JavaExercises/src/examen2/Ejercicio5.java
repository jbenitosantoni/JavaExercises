package examen2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String datos [][] = new String [20][5];
		for(int i = 0; i < datos.length; i++) {
			System.out.println("Nombre");
			datos[i][0] = sc.nextLine();
			System.out.println("Apellidos");
			datos[i][1] = sc.nextLine();
			System.out.println("Provincia");
			datos[i][2] = sc.nextLine();
			System.out.println("Direccion");
			datos[i][3] = sc.nextLine();
			System.out.println("Telefono");
			datos[i][4] = sc.nextLine();
		}
		for (int i = 0; i < datos.length; i++) {
			if (datos[i][2].equalsIgnoreCase("Madrid") || datos[i][2].equalsIgnoreCase("Barcelona")) {
				System.out.print("Nombre: " + datos[i][0] + " - Apellidos" + datos[i][1] + " - Provincia: " + datos[i][2] + " - Direccion: " + datos[i][3] + " - Telefono: " + datos[i][4]);
			}
		}
		sc.close();
	}

}
