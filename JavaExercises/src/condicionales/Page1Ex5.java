package condicionales;

import java.util.Scanner;

public class Page1Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double num1 = sc.nextDouble();
		System.out.println("Introduce otro número");
		double num2 = sc.nextDouble();
		if (num1 > num2 || num1==num2) {
			System.out.println(num1 + ", " + num2);
		} else {
			System.out.println(num2 + ", " + num1);
		}

	}

}
