package condicionales;

import java.util.Scanner;

public class Page6Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nota");
		double nota = sc.nextDouble();
		if (nota < 5 && nota >= 0) {
			System.out.println("Tienes un Suspenso");
		} else if (nota < 6) {
			System.out.println("Tienes un Suficiente");
		} else if (nota < 7) {
			System.out.print("Tienes un Bien");
		} else if (nota < 9) {
			System.out.println("Tienes un Notable");
		} else if (nota <= 10) {
			System.out.println("Tienes un sobresaliente");
		} else {
			System.out.println("Debes introducir un número comprendido entre 0 10");
		}
		sc.close();
	}

}
