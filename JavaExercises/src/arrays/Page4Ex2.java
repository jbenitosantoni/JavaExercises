package arrays;

import java.util.Scanner;

public class Page4Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamaño array 1");
		int tamaño1 = sc.nextInt();
		System.out.println("Tamaño array 2");
		int tamaño2 = sc.nextInt();
		int array1[] = new int[tamaño1];
		int array2[] = new int[tamaño2];
		int array3[] = new int[tamaño1 + tamaño2];
		int contador = (tamaño2)-1;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Valor array 1");
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Valor array 2");
			array2[i] = sc.nextInt();
		}
		for (int i = tamaño1-1; 0 >= i; i--) {
			array3[i] = array1[i];
		}
		for (int i = array3.length; i > tamaño1; i--) {
			array3[i] = array2[contador];
			contador--;
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + ", ");
		}
		sc.close();
	}

}
