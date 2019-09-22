package Condicionales;

import java.util.Scanner;

public class Page1Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double num1 = sc.nextDouble();
		System.out.println("Introduce otro número");
		double num2 = sc.nextDouble();
		System.out.println("Introduce otro número");
		double num3 = sc.nextDouble();
		if (num1 > num2 && num2 > num3) {
			System.out.println(num1 + ", " + num2 + ", " + num3);
		} else if (num2 > num1 && num3 > num1){
			System.out.println(num2 + ", " + num3 + ", " + num1);
		} else if (num3 > num2 && num2 > num1) {
			System.out.println(num3 + ", " + num2 + ", " + num1);
		} else if (num3 > num1 && num1 > num2) {
			System.out.println(num3 + ", " + num1 + ", " + num2);
		} else if (num2 > num1 && num1 > num3) {
			System.out.println(num2 + ", " + num1 + ", " + num3);
		} else if (num1 > num3 && num3 > num2) {
			System.out.println(num1 + ", " + num3 + ", " + num2);
		} else if (num1 == num2 && num2 > num3) {
			System.out.println(num1 + ", " + num2 + ", " + num3);
		} else if (num1 == num2 && num2 > num3) {
			System.out.println(num2 + ", " + num2 + ", " + num3);
		} else if (num3 > num2 && num2 > num1) {
			System.out.println(num3 + ", " + num2 + ", " + num1);
		} else if (num1 == num3 && num3 > num2) {
			System.out.println(num1 + ", " + num3 + ", " + num2);
		} else {
			System.out.print("Todos los números son iguales");
		}

	}

}
