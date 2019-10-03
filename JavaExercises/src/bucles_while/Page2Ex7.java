package bucles_while;

import java.util.Scanner;

public class Page2Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce edad");
		int edad = sc.nextInt();
		int suma = 0;
		int mayoredad = 0;
		while (edad >= 0) {
			suma = suma + edad;
			if (edad >= 18) {
				mayoredad++;
			}
			System.out.println("Introduce edad");
			edad = sc.nextInt();
		}
		if (edad < 0) {
			System.out.println("La suma de las edades es: " + suma + "\nHay " + mayoredad + " mayores de edad.");
		}
		sc.close();
	}
}
