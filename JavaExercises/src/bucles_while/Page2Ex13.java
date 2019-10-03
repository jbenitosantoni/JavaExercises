package bucles_while;

import java.util.Scanner;

public class Page2Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int numero = sc.nextInt();
		int factorial = 1;
		while (numero != 1) {
			factorial = factorial * (numero -1);
			numero--;
		}
		System.out.print(factorial);
		sc.close();
	}
}
