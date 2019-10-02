package bucles_while;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String nombre = null;
		int antonios = 0;
		while (i < 500) {
			System.out.println("Introduce nombre");
				nombre = sc.nextLine();
				if (nombre.contentEquals("Antonio")) {
					antonios++;
				}
			i++;
		}
		System.out.print("Hay " + antonios + " antonios.");
	}

}