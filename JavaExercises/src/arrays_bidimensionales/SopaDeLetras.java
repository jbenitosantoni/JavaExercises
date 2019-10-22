package arrays_bidimensionales;

import java.util.Random;
import java.util.Scanner;

public class SopaDeLetras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		char sopa[][] = new char[20][20];
		Random r = new Random();
		int intro = 0;
		char[] real = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		do {
			System.out.println("1. Iniciar Juego");
			System.out.println("2. Posicionar Palabras");
			System.out.println("3. Mostrar Tabla");
			System.out.println("4. Salir del Juego");
			intro = sc.nextInt();
			switch (intro) {
			case 1:
				for (int i = 0; i < sopa.length; i++) {
					for (int j = 0; j < sopa[0].length; j++) {
						sopa[i][j] = real[r.nextInt(27)];
					}
				}
				break;
			case 2:
				System.out.println("Numero de letras de palabra 1");
				int p1 = sc.nextInt();
				System.out.println("Numero de letras de palabra 2");
				int p2 = sc.nextInt();
				System.out.println("Numero de letras de palabra 3");
				int p3 = sc.nextInt();
				int c1 = 0;
				int c2 = 0;
				char letra = 'A';
				System.out.println("Colocando Palabra 1");
				for (int i = 0; i < p1; i++) {
					System.out.println("Letra " + (i+1) + ":");
					letra = sn.next().charAt(0);
					System.out.println("Fila letra " + (i+1) + ":");
					c1 = sc.nextInt();
					System.out.println("Columna letra " + (i+1) + ":");
					c2 = sc.nextInt();
					sopa[c1][c2] = letra;
				}
				System.out.println("Colocando Palabra 2");
				for (int i = 0; i < p2; i++) {
					System.out.println("Letra " + (i+1) + ":");
					letra = sn.next().charAt(0);
					System.out.println("Fila letra " + (i+1) + ":");
					c1 = sc.nextInt();
					System.out.println("Columna letra " + (i+1) + ":");
					c2 = sc.nextInt();
					sopa[c1][c2] = letra;
				}
				System.out.println("Colocando Palabra 3");
				for (int i = 0; i < p3; i++) {
					System.out.println("Letra " + (i+1) + ":");
					letra = sn.next().charAt(0);
					System.out.println("Fila letra " + (i+1) + ":");
					c1 = sc.nextInt();
					System.out.println("Columna letra " + (i+1) + ":");
					c2 = sc.nextInt();
					sopa[c1][c2] = letra;
				}
				break;
			case 3:
				for (int i = 0; i < sopa.length; i++) {
					for (int j = 0; j < sopa[0].length; j++) {
						System.out.print(sopa[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}
		} while (intro != 4);
		sc.close();
		sn.close();
	}
}
