package ejercioDiscografica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cancion> cancionesPrincipal = new ArrayList<Cancion>();
		ArrayList<Disco> discos = new ArrayList<Disco>();
		Main4.rellenarCanciones(cancionesPrincipal);
		Main4.rellenarDiscos(cancionesPrincipal, discos);
	}

	public static void rellenarDiscos(ArrayList<Cancion> canciones, ArrayList<Disco> discos) {
		System.out.println();
	}

	public static void menu() {
		System.out.println("1. Mostrar los datos del disco recopilatorio que tenga mayor duración.");
		System.out.println("2. Mostrar los datos del disco recopilatorio que tenga menor duración.");
		System.out.println("3. Mostrar el Título de los 2 discos recopilatorios con mayor duración. ");
		System.out.println("4. Mostrar el Título de los 2 discos recopilatorios con menor duración");
		System.out
				.println("5. Mostrar los datos de los discos recopilatorios que tengan discos producidos por Melendi");
		System.out.println(
				"6. Mostrar los datos de los discos recopilatorios que tengan discos publicados antes del año 2000");
		System.out.println("7. Salir");
	}

	public static void rellenarCanciones(ArrayList<Cancion> canciones) {
		canciones.add(new Cancion("La mujer de verde", 2.1));
		canciones.add(new Cancion("Copacabana", 3.9));
		canciones.add(new Cancion("Pausa", 3));
		canciones.add(new Cancion("Que bien", 3));
		canciones.add(new Cancion("Panico Practico", 3.6));
		canciones.add(new Cancion("El pozo", 3));
		canciones.add(new Cancion("La increible historia del hombre que no sabia volar", 3));
		canciones.add(new Cancion("Autoterapia", 4.3));
		canciones.add(new Cancion("Bill Murray", 1));
		canciones.add(new Cancion("El baile", 6));
		canciones.add(new Cancion("Magia y efectos especiales", 4));
		canciones.add(new Cancion("Pequeña gran revolucion", 2));
	}
}
