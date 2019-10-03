package bucles_while;

import java.util.Random;
import java.util.Scanner;

public class Page2Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int numero = 1 + rand.nextInt(99);
		System.out.println("Introduce número entero.");
		int entrada = sc.nextInt();
		while (entrada != numero || entrada == -1) {
			if (entrada > numero) {
			System.out.println("El número a buscar es menor, introduce número entero.");
			} else {
				System.out.println("El número a buscar es mayor, introduce número entero.");	
			}
			entrada = sc.nextInt();
		}
		if (entrada == numero) {
			System.out.println("Has ganado");
		} else if (entrada == -1) {
			System.out.println("Te has rendido");
		}
		sc.close();
	}

}
