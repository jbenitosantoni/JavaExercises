package Condicionales;

import java.util.Scanner;

public class Page5Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos números enteros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 > num2) {
			int unidades = num1 - num2;
			System.out.print("El primer número es mayor que el segundo por " + unidades + " unidades");
		} else if (num2 > num1) {
			int unidades = num2 - num1;
			System.out.print("El segundo número es mayor que el primero por " + unidades + " unidades");
		}
		sc.close();

	}

}
