package Condicionales;

import java.util.Scanner;

public class Page5Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 6 números");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		double num5 = sc.nextDouble();
		double num6 = sc.nextDouble();
		if ((num1 + num2 + num3 + num4 + num5 + num6) > 10) {
			System.out.print(num1 * num2 * num3 * num4 * num5 * num6);
		} else {
			System.out.print("Los números deben sumar mas de 10");
		}
		sc.close();
	}

}