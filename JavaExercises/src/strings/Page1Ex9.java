package strings;

import java.util.Scanner;

public class Page1Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String datos[][] = new String[10][2];
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[0].length; j++) {
				if (j == 0) {
					System.out.println("Introduce DNI");
					datos[i][0] = sc.nextLine();
				} else if (j == 1){
					System.out.println("Introduce Nombre");
					datos[i][1] = sc.nextLine();
				} else {
					System.out.println("Introduce Provincia");
					datos[i][2] = sc.nextLine();
				}
			}
		}
		for (int i = 0; i < datos.length; i++) {
			if (datos[i][0].charAt(datos[i][0].length()) == 'J') {
				datos[i][2] = "Leon";
			}
		}
	}

}
