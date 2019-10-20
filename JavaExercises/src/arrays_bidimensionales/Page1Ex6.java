package arrays_bidimensionales;

import java.util.Scanner;

public class Page1Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int notas[][] = new int[5][3];
		int mediabd = 0;
		int mediaprogra = 0;
		int mediamoviles = 0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++) {
				if (j == 0) {
					System.out.println("Nota de alumno " + (i + 1) + " en BD");
					notas[i][j] = sc.nextInt();
				} else if (j == 1) {
					System.out.println("Nota de alumno " + (i + 1) + " en Programacion");
					notas[i][j] = sc.nextInt();
				} else if (j == 2) {
					System.out.println("Nota de alumno " + (i + 1) + " en Moviles");
					notas[i][j] = sc.nextInt();
				}
			}
		}
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++) {
				if (j == 0) {
					mediabd = mediabd + notas[i][j];
				} else if (j == 1) {
					mediaprogra = mediaprogra + notas[i][j];
				} else if (j == 2) {
					mediamoviles = mediamoviles + notas[i][j];
				}
			}
		}
		System.out.print("Media BD: " + mediabd/notas.length + "\nMedia Programacion: " + mediaprogra/notas.length + "\nMedia moviles: " + mediamoviles/notas.length);
		sc.close();
	}
}
