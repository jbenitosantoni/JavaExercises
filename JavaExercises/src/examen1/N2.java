package examen1;

import java.util.Scanner;

public class N2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduce 5 números");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		double num5 = sc.nextDouble();
		if (num1 > 100) {
			System.out.print(num1 + ", ");
		}
		if (num2 > 100) {
			System.out.print(num2 + ", ");
		}
		if (num3 > 100) {
			System.out.print(num3 + ", ");
		}
		if (num4 > 100) {
			System.out.print(num4 + ", ");
		}
		if (num5 > 100) {
			System.out.print(num5 + ", ");
		}
		if (num1 <= 100) {
			System.out.print(num1 + ", ");
		}
		if (num2 <= 100) {
			System.out.print(num2 + ", ");
		}
		if (num3 <= 100) {
			System.out.print(num3 + ", ");
		}
		if (num4 <= 100) {
			System.out.print(num4 + ", ");
		}
		if (num5 <= 100) {
			System.out.print(num5 + ", ");
		}
		sc.close();

	}

}
