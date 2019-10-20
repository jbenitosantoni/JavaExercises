package arrays_bidimensionales;

import java.util.Scanner;

public class Page1Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String baloncesto[][] = new String[12][5];
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
		sc.close();
	}

}
