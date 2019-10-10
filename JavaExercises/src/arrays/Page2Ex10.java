package arrays;

import java.util.Scanner;

public class Page2Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array1[] = new int[10];
		int array2[] = new int[10];
		boolean iguales = true;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Numero para array 1");
			array1[i] = sc.nextInt();
			System.out.println("Numero para array 2");
			array2[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				iguales = false;
			}
		}
		if (!iguales) {
			System.out.print("No son iguales");
		} else {
			System.out.print("Son iguales");
		}
		sc.close();
	}

}
