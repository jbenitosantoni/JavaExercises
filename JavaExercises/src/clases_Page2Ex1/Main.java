package clases_Page2Ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		VecinaRubia[] vecina = new VecinaRubia[500];
		CazurroLeones[] cazurros = new CazurroLeones[500];

		for (int i = 0; i < vecina.length; i++) {
			String nombre;
			String apellidos;
			int brilli;
			int melena;
			int haters;
			int followers;

			System.out.println("Nombre");
			nombre = sc.nextLine();
			System.out.println("Apellidos");
			apellidos = sc.nextLine();
			System.out.println("Nivel Brilli Brilli");
			brilli = sn.nextInt();
			System.out.println("Longitud Melena");
			melena = sn.nextInt();
			System.out.println("Numero Haters");
			haters = sn.nextInt();
			System.out.println("Numero Followers");
			followers = sn.nextInt();
			vecina[i] = new VecinaRubia(nombre, apellidos, brilli, melena, haters, followers);

		}

		for (int i = 0; i < cazurros.length; i++) {
			String nombre;
			String apellidos;
			int cazurrismo;
			int altura;
			int peso;
			int alcohol;
			int haters;

			System.out.println("Nombre");
			nombre = sc.nextLine();
			System.out.println("Apellidos");
			apellidos = sc.nextLine();
			System.out.println("Nivel Cazurrismo");
			cazurrismo = sn.nextInt();
			System.out.println("Altura");
			altura = sn.nextInt();
			System.out.println("Peso");
			peso = (sn.nextInt());
			System.out.println("Capacidad Alcoholica");
			alcohol = sn.nextInt();
			System.out.println("Numero de haters");
			haters = sn.nextInt();
			cazurros[i] = new CazurroLeones(nombre, apellidos, cazurrismo, altura, peso, alcohol, haters);
		}

		for (int i = 0; i < cazurros.length; i++) {
			if (cazurros[i].getNivel_cazurrismo() > 9) {
				cazurros[i].setCapacidad_alcoholica(cazurros[i].getCapacidad_alcoholica() + 1);
			}
			if (cazurros[i].getNombre().charAt(cazurros[i].getNombre().length()) == 'a') {
				cazurros[i].setN_haters(0);
			}
		}

		for (int i = 0; i < vecina.length; i++) {
			if (vecina[i].getLongitud_melena() < 45) {
				vecina[i].setNivel_brillibrilli(vecina[i].getNivel_brillibrilli() - 1);
			}
			if (vecina[i].getNombre().charAt(vecina[i].getNombre().length()) == 'a') {
				vecina[i].setN_heaters(0);
			}
		}

		sc.close();
		sn.close();
	}

}