package arrays;

import java.util.Scanner;

public class Page2Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares[] = new int[20];
		int contadorpares = 0;
		int numero = 0;
		while (contadorpares < pares.length) {
			System.out.println("Introduce número");
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				pares[contadorpares] = numero;
				contadorpares++;
			}
		}
		for (int i = 0; i < pares.length; i++) {
			System.out.print(pares[i] + " ,");
		}
		sc.close();
	}
}
