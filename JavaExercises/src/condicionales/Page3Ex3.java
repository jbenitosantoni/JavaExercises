package condicionales;

import java.util.Scanner;

public class Page3Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int numero = sc.nextInt();
		if (numero % 2 == 0) {
			System.out.print("El número es par");
		} else {
			System.out.print("El número es impar");
		}

	}

}
