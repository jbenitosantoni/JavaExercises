package examen1;

import java.util.Scanner;

public class N6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número de horas");
		double horas = sc.nextDouble();
		System.out.println("Introduce número de dias");
		double dias = sc.nextDouble();
		System.out.print("Has tardado: " + (horas * 60 + dias * 24 * 60) + " minutos.");
		sc.close();
	}

}
