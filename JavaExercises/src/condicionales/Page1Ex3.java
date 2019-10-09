package condicionales;

import java.util.Scanner;

public class Page1Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double num1 = sc.nextDouble();
		System.out.println("Introduce otro número");
		double num2 = sc.nextDouble();
		if (num1>num2) {
			System.out.println("El primer número es mayor que el segundo");
		} else {
			System.out.println("El segundo numero es mayor que el primero");
		}
	}

}
