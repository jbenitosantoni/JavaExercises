package switches;

import java.util.Scanner;

public class Page1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Calcular el área de un cuadrado");
		System.out.println("2. Calcular el área de un triángulo");
		System.out.println("3. Calcular el área de un círculo");
		System.out.println("4. Salir");
		int intro = sc.nextInt();
		if (intro == 1) {
			System.out.println("Introduce lado");
			double lado = sc.nextDouble();
			System.out.print("El área es: " + lado);
		} else if (intro == 2) {
			System.out.print("Introduce base y altura");
			double base = sc.nextDouble();
			double altura = sc.nextDouble();
		} else if (intro == 3) {
			System.out.print("Introduce radio");
			double radio = sc.nextDouble();
			System.out.print("El área es: " + Math.PI * Math.pow(radio, 2));
		} else if (intro == 4) {
			System.out.print("Saliendo...");
		} else {
			System.out.print("Introduce un número del 1-4");
		}

	}

}
