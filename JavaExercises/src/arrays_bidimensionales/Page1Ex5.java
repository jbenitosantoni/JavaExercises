package arrays_bidimensionales;

import java.util.Scanner;

public class Page1Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		System.out.println("Numero de personas");
		int entrada = sc.nextInt();
		String nombre[] = new String [entrada];
		boolean personas[][] = new boolean[entrada][2];
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Introduce nombre");
			nombre[i] = sn.nextLine();
			System.out.println("Es vegetariano? (True o False)");
			personas[i][0] = sb.nextBoolean();
			System.out.println("Eres religioso? (True o False)");
			personas[i][1] = sb.nextBoolean();
		}
		sc.close();
		sn.close();
		sb.close();
	}

}
