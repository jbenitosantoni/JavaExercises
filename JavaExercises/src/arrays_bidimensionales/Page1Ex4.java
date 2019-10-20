package arrays_bidimensionales;

import java.util.Scanner;

public class Page1Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String datos [][] = new String [10][2];
		for (int i = 0; i < datos.length; i++) {
			System.out.println("Introduce nombre");
			datos[i][0] = sc.nextLine();
			System.out.println("Introduce DNI");
			datos[i][1] = sc.nextLine();
		}
		sc.close();
	}

}
