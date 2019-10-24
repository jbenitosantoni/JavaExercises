package examen2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[20];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce número");
			numeros[i] = sc.nextInt();
		}
		System.out.print("Numeros mayores de 5: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 5) {
				System.out.print(numeros[i] + ", ");
			}
		}
		System.out.print("\nNumeros menores de 5: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 5) {
				System.out.print(numeros[i] + ", ");
			}
		}
		sc.close();
	}

}
