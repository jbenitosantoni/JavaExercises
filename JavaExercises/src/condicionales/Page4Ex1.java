package condicionales;

import java.util.Scanner;

public class Page4Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double num1 = sc.nextDouble();
		if (num1 % 2 == 0 && num1 > 500) {
			System.out.print("El numero es par y mayor de 500.");
		}
		sc.close();
	}

}
