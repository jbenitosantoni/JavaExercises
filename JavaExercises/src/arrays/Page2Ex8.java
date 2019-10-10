package arrays;

import java.util.Scanner;

public class Page2Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[10];
		int media = 0;
		int pares = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			if (i == 0 || i % 2 == 0) {
				media = media + numeros[i];
				pares++;
			}
		}
		media = media / pares;
		System.out.print("La media de los pares es: " + media + " y hay " + pares + " pares.");
		sc.close();
	}

}
