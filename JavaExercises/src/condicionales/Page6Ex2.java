package condicionales;

import java.util.Scanner;

public class Page6Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tres números");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		if (num1 > num2 && num2 > num3) {
			System.out.print(num1 + ", " + num2 + ", " + num3);
		} else if (num2 > num3 && num3 > num1) {
			System.out.print(num2 + ", " + num3 + ", " + num1);
		} else if (num3 > num2 && num2 > num1) {
			System.out.print(num3 + ", " + num2 + ", " + num1);
		} else if (num3 > num1 && num1 > num2) {
			System.out.print(num3 + ", " + num1 + ", " + num2);
		} else if (num2 > num1 && num1 > num3) {
			System.out.print(num2 + ", " + num1 + ", " + num3);
		} else if (num1 > num3 && num3 > num2) {
			System.out.print(num1 + ", " + num3 + ", " + num2);
		} else if (num1 == num2 && num2 > num3) {
			System.out.print(num1 + ", " + num2 + ", " + num3);
		} else if (num3 == num2 && num3 > num3) {
			System.out.print(num3 + ", " + num2 + ", " + num1);
		}else if (num1 == num3 && num3 > num2) {
			System.out.print(num1 + ", " + num3 + ", " + num2);
		} else {
			System.out.print("Todos los números son iguales");
		}
		sc.close();
	}
}
