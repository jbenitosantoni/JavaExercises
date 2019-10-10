package arrays;

import java.util.Scanner;

public class Page2Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int nota[] = new int [10];
		String nombre[] = new String [10];
		String notapalabras[] = new String [10];
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Introduce nombre");
			nombre[i] = sn.nextLine();
			System.out.println("Introduce nota");
			nota[i] = sc.nextInt();
		}
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] < 5 && nota[i] >= 0) {
				notapalabras[i] = "Suspenso";
			} else if (nota[i] < 7 && nota[i] >= 5) {
				notapalabras[i] = "Bien";
			} else if (nota[i] < 9 && nota[i] >= 7) {
				notapalabras[i] = "Notable";
			} else if (nota[i] <= 10 && nota[i] >= 9) {
				notapalabras[i] = "Sobresaliente";
			}
		}
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Alumno nº" + i + ": " + nombre[i] + " - " + "Nota: " + nota[i] + " - " + notapalabras[i]);
		}
		sc.close();
		sn.close();
	}

}
