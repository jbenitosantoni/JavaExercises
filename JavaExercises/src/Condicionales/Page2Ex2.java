package Condicionales;

import java.util.Scanner;

public class Page2Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double num1 = sc.nextDouble();
		System.out.println("Introduce otro número");
		double num2 = sc.nextDouble();
		if (num1 == num2) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números son diferentes");
		}

	}

}
