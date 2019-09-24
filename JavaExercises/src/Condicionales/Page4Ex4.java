package Condicionales;

import java.util.Scanner;

public class Page4Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tres números");
		double num1 = sc.nextDouble();
		if (num1 > 100 && num1 < 200) {
			System.out.print("El número " + num1 + " está comprendido entre 100 y 200");
		} else {
			System.out.print("El número " + num1 + " NO está comprendido entre 100 y 200");
		}
		sc.close();
	}

}
