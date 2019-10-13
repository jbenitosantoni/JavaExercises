package arrays;

import java.util.Scanner;

public class Page4Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String nombre[] = new String[50];
		int programacion[] = new int[50];
		int moviles[] = new int[50];
		int marcas[] = new int[50];
		int bd[] = new int[50];
		int mediaprogramacion = 0;
		int mediabd = 0;
		int mejornotamarcas = 0;
		int mejoralumnomarcas = 0;
		int mejornotamoviles = 0;
		int mejoralumnomoviles = 0;
		int mejoralumnomedia = 0;
		for (int i = 0; i < bd.length; i++) {
			System.out.println("Nombre");
			nombre[i] = sn.nextLine();
			System.out.println("Nota programacion");
			programacion[i] = sc.nextInt();
			System.out.println("Nota moviles");
			moviles[i] = sc.nextInt();
			System.out.println("Nota marcas");
			marcas[i] = sc.nextInt();
			System.out.println("Nota BD");
			bd[i] = sc.nextInt();
		}
		for (int i = 0; i < bd.length; i++) {
			mediaprogramacion = mediaprogramacion + programacion[i];
			mediabd = mediabd + bd[i];
		}
		for (int i = 0; i < bd.length; i++) {
			if (marcas[i] > mejornotamarcas) {
				mejornotamarcas = marcas[i];
				mejoralumnomarcas = i;
			}
		}
		for (int i = 0; i < bd.length; i++) {
			if (moviles[i] > mejornotamoviles) {
				mejornotamoviles = marcas[i];
				mejoralumnomoviles = i;
			}
		}
		for (int i = 0; i < bd.length; i++) {
			if (((programacion[i] + moviles[i] + marcas[i] + bd[i]) / 4) > mejoralumnomedia) {
				mejoralumnomedia = (programacion[i] + moviles[i] + marcas[i] + bd[i]) / 4;
			}
		}
		System.out.println("Media programacion: " + (mediaprogramacion = mediaprogramacion / programacion.length));
		System.out.println("Media BD: " + (mediabd / bd.length));
		System.out.println("Mejor alumno en marcas: " + nombre[mejoralumnomarcas]);
		System.out.println("Mejor alumno en moviles: " + nombre[mejoralumnomoviles]);
		System.out.println("Mejor media: " + nombre[mejoralumnomedia]);
		sc.close();
		sn.close();
	}
}
