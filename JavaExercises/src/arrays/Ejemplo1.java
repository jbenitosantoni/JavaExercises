package arrays;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombres[] = new String[10];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce nombre");
			nombres[i] = sc.nextLine();
		}
		sc.close();
	}
}