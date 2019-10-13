package arrays;

import java.util.Scanner;

public class Page4Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array1[] = new int[10];
		int array2[] = new int[10];
		int array3[] = new int[10];
		int array4[] = new int[10];
		int array5[] = new int[10];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce valor");
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce valor");
			array2[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce valor");
			array3[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce valor");
			array4[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce valor");
			array5[i] = sc.nextInt();
		}
		sc.close();
	}

}
