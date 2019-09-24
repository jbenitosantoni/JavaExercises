package Condicionales;

import java.util.Scanner;

public class Page5Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int num1 = sc.nextInt();
		double cien = 100 - num1;
		System.out.print("A el número introducido le quedan " + cien + " unidades para llegar a cien.");
		sc.close();
	}

}
