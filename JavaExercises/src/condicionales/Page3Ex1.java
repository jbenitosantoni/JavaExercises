package condicionales;

import java.util.Scanner;

public class Page3Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de jugadores que necesitas");
		int jugadores = sc.nextInt();
		double presupuesto = jugadores * 2000000;
		System.out.println("Numero de jugadores comunitarios");
		int jugadorescomunitarios = sc.nextInt();
		System.out.println("Numero de jugadores extranjeros");
		int jugadoresextranjeros	 = sc.nextInt();
		if (jugadorescomunitarios > 5) {
			presupuesto = presupuesto - 5000000;
		} if (jugadoresextranjeros >= 2) {
			presupuesto = presupuesto - 5000000;
		}
		System.out.print("Dispones de " + presupuesto + " euros de presupuesto.");
	}

}
