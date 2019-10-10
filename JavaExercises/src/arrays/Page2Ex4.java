package arrays;

import java.util.Scanner;

public class Page2Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int [10];
		int positivo = 0;
		int negativo = 0;
		int cero = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce número");
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				positivo++;
			} else if (numeros[i] < 0) {
				negativo++;
			} else {
				cero++;
			}
		}
		sc.close();
	}

}
