package strings;

import java.util.Scanner;

public class Page1Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomApe[][] = new String[10][2];
		int contador = 0;
		for (int i = 0; i < nomApe.length; i++) {
			for (int j = 0; j < nomApe[0].length; j++) {
				if (j == 1) {
					System.out.println("Introduce nombre");
					nomApe[i][1] = sc.nextLine();
				} else {
					System.out.println("Introduce apellido");
					nomApe[i][0] = sc.nextLine();
				}
			}
		}
		for (int i = 0; i < nomApe.length; i++) {
			if (nomApe[i][0].equalsIgnoreCase("Antonio")) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " Antonios.");
		sc.close();
	}

}
