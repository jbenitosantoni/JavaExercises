package bucles_while;

import java.util.Scanner;

public class Page2Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double numero = sc.nextDouble();
		while (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
			if (numero > 0) {
				System.out.println("Es positivo");
			}
			System.out.println("El cuadrado es: " + numero * numero);
			System.out.println("Introduce otro número");
			numero = sc.nextDouble();
		}
		if (numero == 0) {
			System.out.println("El número es 0, se acaba el bucle");
		}
		sc.close();
	}

}
