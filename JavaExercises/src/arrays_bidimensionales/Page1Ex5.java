package arrays_bidimensionales;

import java.util.Scanner;

public class Page1Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int entrada = sc.nextInt();
		String personas[][] = new String[entrada][2];
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Introduce nombre");
			personas[i][0] = sn.nextLine();
			System.out.println("Es vegetariano? (True o False)");
			personas[i][1] = sn.nextLine();
			System.out.println("Eres religioso? (True o False)");
			personas[i][2] = sn.nextLine();
		}
		sc.close();
		sn.close();
	}

}
