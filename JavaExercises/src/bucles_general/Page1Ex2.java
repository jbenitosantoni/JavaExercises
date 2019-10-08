package bucles_general;

import java.util.Scanner;

public class Page1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número entero entre 1 y 10");
		int numero = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.print(numero + "*" + i + "=" + numero * i + " ");
		}

	}

}
