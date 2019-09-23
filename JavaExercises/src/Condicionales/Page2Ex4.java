package Condicionales;

import java.util.Scanner;

public class Page2Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número de puntos");
		double puntos = sc.nextDouble();
		if (puntos >= 45) {
			System.out.println("Puedes optar a biología");
			if (puntos >= 79) {
				System.out.println("Puedes optar a empresariales");
				if (puntos >= 90) {
					System.out.println("Puedes optar a derecho");
					if (puntos >= 100) {
						System.out.println("Puedes optar a sistemas");
						if (puntos >= 120) {
							System.out.println("Puedes optar a informática");
						}
					}
				}
			}
		}
	}

}
