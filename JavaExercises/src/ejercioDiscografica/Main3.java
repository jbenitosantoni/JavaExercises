package ejercioDiscografica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {

	}

	public static void menu() {
		System.out.println("1. Mostrar en pantalla el nº de veces que aparece una misma canción en varios discos.");
		System.out.println(
				"2. Mostrar la duración de todas las canciones de los discos que el titulo empiece por 'o' o 'e'");
		System.out.println("3. Titulo de disco y vaciar todo su arrayList de canciones.");
		System.out.println("4. Título de disco y modificar las canciones que el usuario quiera");
		System.out.println("5. Salir");
	}

	public static void modificarCancionDisco(ArrayList<Disco> discos) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce nombre disco");
		String nombre = sc.nextLine();
		for (int i = 0; i < discos.size(); i++) {
			if (discos.get(i).getTitulo().equalsIgnoreCase(nombre)) {
				for (int j = 0; j < discos.get(i).getCanciones().size(); j++) {
					System.out.println(discos.get(i).getCanciones().get(j));
				}
				System.out.println("Introduce numero cancion (1 2 o 3)");
				int seleccion = sn.nextInt();
				System.out.println("1. Cambiar Titulo");
				System.out.println("2. Cambiar Duracion");
				int seleccion2 = sn.nextInt();
				seleccion = seleccion - 1;
				if (seleccion2 == 1) {
					System.out.println("Introduce nuevo titulo");
					String nuevotitulo = sc.nextLine();
					discos.get(i).getCanciones().get(seleccion).setTitulo(nuevotitulo);
				} else if (seleccion2 == 2) {
					System.out.println("Introduce nuevo titulo");
					double nuevaDuracion = sn.nextDouble();
					discos.get(i).getCanciones().get(seleccion).setDuracion(nuevaDuracion);
				}

			}
		}
	}

	public static ArrayList<Cancion> mostrarCancionesDisco(ArrayList<Disco> discos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre disco");
		String nombre = sc.nextLine();
		for (int i = 0; i < discos.size(); i++) {
			if (discos.get(i).getTitulo().equalsIgnoreCase(nombre)) {
				return discos.get(i).getCanciones();
			}
		}
		return null;
	}

	public static void duracionOE(ArrayList<Disco> discos) {
		for (int i = 0; i < discos.size(); i++) {
			if (discos.get(i).getTitulo().charAt(0) == 'o' || discos.get(i).getTitulo().charAt(0) == 'e') {
				for (int j = 0; j < discos.get(i).getCanciones().size(); j++) {
					System.out.println(discos.get(i).getCanciones().get(j).getDuracion() + " - ");
				}
			}
		}
	}

	public static int cancionRepetida(ArrayList<Disco> discos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre cancion");
		String nombre = sc.nextLine();
		int contador = 0;
		for (int i = 0; i < discos.size(); i++) {
			for (int j = 0; j < discos.get(i).getCanciones().size(); j++) {
				if (discos.get(i).getCanciones().get(j).getTitulo().equalsIgnoreCase(nombre)) {
					contador++;
				}
			}
		}
		return contador;
	}
}
