package arrays_bidimensionales;

import java.util.Scanner;

public class Page1Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String baloncesto[][] = new String[12][5];
		String nombre = "";
		for (int i = 0; i < baloncesto.length; i++) {
			for (int j = 0; j < baloncesto[0].length; j++) {
				if (j == 0) {
					System.out.println("Nombre");
					baloncesto[i][j] = sc.nextLine();
				} else if (j == 1) {
					System.out.println("Dorsal");
					baloncesto[i][j] = sc.nextLine();
				} else if (j == 2) {
					System.out.println("Puntos");
					baloncesto[i][j] = sc.nextLine();
				} else if (j == 3) {
					System.out.println("Rebotes");
					baloncesto[i][j] = sc.nextLine();
				} else if (j == 4) {
					System.out.println("Robos");
					baloncesto[i][j] = sc.nextLine();
				}
			}
		}

		System.out.println("1. Ver estadísticas de todos los jugadores");
		System.out.println("2. Ver estadísticas de un jugador");
		System.out.println("3. Salir");
		int intro = sc.nextInt();
		do {
			switch (intro) {
			case 1:
				for (int i = 0; i < baloncesto.length; i++) {
					for (int j = 0; j < baloncesto[0].length; j++) {
						if (j == 0) {
							System.out.print(baloncesto[i][j]);

						} else if (j == 1) {
							System.out.print(" - nº" + baloncesto[i][j] + " - ");
						} else if (j == 2) {
							System.out.print(baloncesto[i][j] + " puntos - ");
						} else if (j == 3) {
							System.out.print(baloncesto[i][j] + " rebotes - ");
						} else if (j == 4) {
							System.out.println(baloncesto[i][j] + " robos");
						}
					}
				}
				break;
			case 2:
				System.out.println("Introduce nombre de jugador");
				nombre = sc.nextLine();
				for (int i = 0; i < baloncesto.length; i++) {
					if (baloncesto[i][0].equalsIgnoreCase(nombre)) {
						System.out.print(baloncesto[i][1] + " puntos - " + baloncesto[i][2] + " rebotes - "
								+ baloncesto[i][3] + " robos");
					}
				}
			}
		} while (intro != 3);
		sc.close();
		sn.close();
	}
}
