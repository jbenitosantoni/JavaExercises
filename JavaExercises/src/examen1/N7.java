package examen1;

import java.util.Scanner;

public class N7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 10 números");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		double num5 = sc.nextDouble();
		double num6 = sc.nextDouble();
		double num7 = sc.nextDouble();
		double num8 = sc.nextDouble();
		double num9 = sc.nextDouble();
		double num10 = sc.nextDouble();
		if (num1 == 23 || num1 == 54) {
			System.out.print(num1 + ", ");
		}
		if (num2 == 23 || num2 == 54) {
			System.out.print(num2 + ", ");
		}
		if (num3 == 23 || num3 == 54) {
			System.out.print(num3 + ", ");
		}
		if (num4 == 23 || num4 == 54) {
			System.out.print(num4 + ", ");
		}
		if (num5 == 23 || num5 == 54) {
			System.out.print(num5 + ", ");
		}
		if (num6 == 23 || num6 == 54) {
			System.out.print(num6 + ", ");
		}
		if (num7 == 23 || num7 == 54) {
			System.out.print(num7 + ", ");
		}
		if (num8 == 23 || num8 == 54) {
			System.out.print(num8 + ", ");
		}
		if (num9 == 23 || num9 == 54) {
			System.out.print(num9 + ", ");
		}
		if (num10 == 23 || num10 == 54) {
			System.out.print(num10 + ", ");
		}
		if (num1 != 15 && num2 != 15 && num3 != 15 && num4 != 15 && num5 != 15 && num6 != 15 && num7 != 15 && num8 != 15
				&& num9 != 15 && num10 != 15) {
			System.out.print("\nNinguno de los números es 15 por lo tanto el resultado de la operación es: "
					+ (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) * 3);
		}
		sc.close();
	}

}
