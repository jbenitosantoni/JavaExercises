package arrays;

import java.util.Scanner;

public class Page4Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamaño array 1");
		int tamaño1 = sc.nextInt();
		int array1[] = new int[tamaño1];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Valor array");
			array1[i] = sc.nextInt();
		}
		if (array1.length % 2 == 0) {
			int contador = (array1.length - 1) / 2;
			int array2[] = new int[tamaño1 / 2];
			int array3[] = new int[tamaño1 / 2];
			for (int i = 0; i < (array1.length / 2); i++) {
				array2[i] = array1[i];
			}
			for (int i = 0; i < (array1.length / 2); i++) {
				array3[i] = array2[contador];
				contador++;
			}
		} else if (array1.length % 2 != 0) {
			int array2[] = new int[tamaño1 / 2];
			int array3[] = new int[tamaño1 / 2];
			int array4[] = { array1[array1.length] };
			int contador = (array1.length - 1) / 2;
			for (int i = 0; i < ((array1.length - 1) / 2); i++) {
				array2[i] = array1[i];
			}
			for (int i = 0; i < ((array1.length - 1) / 2); i++) {
				array3[i] = array2[contador];
				contador++;
			}
		}
		sc.close();
	}
}
