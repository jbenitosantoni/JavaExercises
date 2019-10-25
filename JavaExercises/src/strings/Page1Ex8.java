package strings;

import java.util.Scanner;

public class Page1Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ciudades[] = new String[7];
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println("Introduce ciudad");
			ciudades[i] = sc.nextLine();
		}
		for (int i = 0; i < ciudades.length; i++) {
			ciudades[i] = Character.toUpperCase(ciudades[i].charAt(0)) + ciudades[i].substring(1);
		}
		sc.close();
	}

}
