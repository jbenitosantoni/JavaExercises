package Condicionales;

import java.util.Scanner;

public class Page4Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tres números");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		double suma = num1 + num2 + num3;
		if (suma > 0) {
			System.out.println(suma);
		} else {
			if (num1 < 0) {
				System.out.println(num1);
			}
			if (num2 < 0) {
				System.out.println(num2);
			}
			if (num3 < 0) {
				System.out.println(num3);
			}
		}

	}

}
