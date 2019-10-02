package bucles_while;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int antonio = 0;
		String nombre = "";
		while (!nombre.equalsIgnoreCase("Brais")) {
			System.out.println("Introduce nombre");
			nombre = sc.nextLine();
			i++;
			if (nombre.contentEquals("Antonio")) {
				antonio++;
			}
		}
		System.out.println("Ya hemos conseguido un Brais tras repetir el bucle " + i + " veces.");
		System.out.println("Se han introducido " + antonio + " Antonios");
		sc.close();
	}
}
