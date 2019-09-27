package switches;

import java.util.Scanner;

public class Page1Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.print("Cantidad de ruedas");
		int ruedas = sc.nextInt();
		if (ruedas < 12) {
			System.out.print("El precio es de: " + 250 * ruedas);
		} else if (ruedas >= 12) {
			System.out.print("El precio es de: " + 220 * ruedas);
		}
		sc.close();
	}

}
