package bucles_while;

import java.util.Scanner;

public class Page2Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nombre");
		String nombre = sc.nextLine();
		int i = 1;
		while (!nombre.equalsIgnoreCase("Pablito Escobar")) {
			System.out.println("Introduce otra vez un nombre");
			nombre = sc.nextLine();
			i++;
		}
		if (nombre.equalsIgnoreCase("Pablito Escobar")) {
			System.out.println("Plata o plomo!" + "\nHas introducido " + i + " nombres hasta acertar");
		}
	}

}
