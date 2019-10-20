package arrays_bidimensionales;

import java.util.Scanner;

public class Page1Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		System.out.print("Introduce numero de usuarios");
		int usuarios = sc.nextInt();
		String nombre[] = new String[usuarios];
		boolean datos[][] = new boolean[nombre.length][3];
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Introduce Nombre");
			nombre[i]= sn.nextLine();
			for (int j = 0; j < datos[0].length; j++) {
				if (j == 0) {
					System.out.print("Eres Vegano?");
					datos[i][j] = sb.nextBoolean();
				} else if (j == 1) {
					System.out.print("Eres mayor de edad?");
					datos[i][j] = sb.nextBoolean();
				} else if (j == 2) {
					System.out.print("Eres poliamoroso?");
					datos[i][j] = sb.nextBoolean();
				}
			}
		}
		sc.close();
		sn.close();
		sb.close();
	}

}
