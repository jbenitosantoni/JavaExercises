package condicionales;

import java.util.Scanner;

public class Page5Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tres números");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		if (num1 > num2 && num3 < num2) {
			System.out.println("El primer número es el mayor");
		} else if (num1 > num3 && num2 < num3) {
			System.out.println("El primer número es el mayor");
		} else if (num2 > num1 && num3 < num1) {
			System.out.println("El segundo número es el mayor");
		} else if (num2 > num3 && num1 < num3) {
			System.out.println("El segundo número es el mayor");
		} else if (num3 > num1 && num2 < num1) {
			System.out.println("El tercer número es el mayor");
		} else if (num3 > num2 && num1 < num2) {
			System.out.println("El tercer número es el mayor");
		} if (num1 == 0 || num2 == 0 || num3 == 0) {
			System.out.println("Además uno de los números es 0");
		}
		sc.close();
	}

}
