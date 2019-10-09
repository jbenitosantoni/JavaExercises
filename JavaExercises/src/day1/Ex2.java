package day1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		double num1 = sc.nextDouble();
		System.out.println("Introduce otro numero");
		double num2 = sc.nextDouble();
		System.out.println("Introduce otro numero");
		double num3 = sc.nextDouble();
		double operacion = Math.pow(Math.pow(num1, num2), num3);
		System.out.print("El resultado es: " + operacion);
	}

}
